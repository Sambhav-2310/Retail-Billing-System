package in.sambhav.billingSoftware.service.implementation;

import in.sambhav.billingSoftware.Repository.CategoryRepository;
import in.sambhav.billingSoftware.Repository.ItemRepository;
import in.sambhav.billingSoftware.entity.CategoryEntity;
import in.sambhav.billingSoftware.entity.ItemsEntity;
import in.sambhav.billingSoftware.io.ItemRequest;
import in.sambhav.billingSoftware.io.ItemResponse;
import in.sambhav.billingSoftware.service.FileUploadService;
import in.sambhav.billingSoftware.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final FileUploadService fileUploadService;
    private final CategoryRepository categoryRepository;
    private final ItemRepository itemRepository;

    @Override
    public ItemResponse add(ItemRequest request, MultipartFile file) {
        String imgUrl = fileUploadService.uploadFile(file);
        ItemsEntity newItem = convertToEntity(request);
        CategoryEntity existingCategory = categoryRepository.findByCategoryId(request.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found : "+request.getCategoryId()));
        newItem.setCategory(existingCategory);
        newItem.setImgUrl(imgUrl);
        newItem = itemRepository.save(newItem);
        return convertToResponse(newItem);
    }

    private ItemResponse convertToResponse(ItemsEntity newItem) {
        return ItemResponse.builder()
                .itemId(newItem.getItemId())
                .name(newItem.getName())
                .description(newItem.getDescription())
                .price(newItem.getPrice())
                .imgUrl(newItem.getImgUrl())
                .categoryName(newItem.getCategory().getName())
                .categoryId(newItem.getCategory().getCategoryId())
                .createdAt(newItem.getCreatedAt())
                .updatedAt(newItem.getUpdatedAt())
                .build();
    }

    private ItemsEntity convertToEntity(ItemRequest request) {
        return ItemsEntity.builder()
                .itemId(UUID.randomUUID().toString())
                .name(request.getName())
                .description(request.getDescription())
                .price(request.getPrice())
                .build();
    }

    @Override
    public List<ItemResponse> fetchItem() {
        return itemRepository.findAll()
                .stream()
                .map(itemsEntity -> convertToResponse(itemsEntity))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteItem(String itemId) {
        ItemsEntity existingItem = itemRepository.findByItemId(itemId)
                .orElseThrow(() -> new RuntimeException("Item not found : "+itemId));
        boolean isFileDeleted = fileUploadService.deleteFile(existingItem.getImgUrl());
        if(isFileDeleted){
            itemRepository.delete(existingItem);
        }else{
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Unable to delete the image");
        }
    }
}
