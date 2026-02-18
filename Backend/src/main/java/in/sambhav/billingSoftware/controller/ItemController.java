package in.sambhav.billingSoftware.controller;

import in.sambhav.billingSoftware.io.ItemRequest;
import in.sambhav.billingSoftware.io.ItemResponse;
import in.sambhav.billingSoftware.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;
import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/admin/items")
    public ItemResponse addItem(@RequestPart("item")String itemString, @RequestPart("file")MultipartFile file){
        ObjectMapper objectMapper = new ObjectMapper();
        ItemRequest itemRequest = null;
        try{
            itemRequest = objectMapper.readValue(itemString, ItemRequest.class);
            return itemService.add(itemRequest,file);
        } catch (JacksonException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Error occured while processing the file");
        }
    }

    @GetMapping("/items")
    public List<ItemResponse> readItems(){
        return itemService.fetchItem();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/admin/items/{itemId}")
    public void deleteItem(@PathVariable String itemId){
        try {
            itemService.deleteItem(itemId);
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Item not found");
        }
    }
}
