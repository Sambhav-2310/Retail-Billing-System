package in.sambhav.billingSoftware.service;

import in.sambhav.billingSoftware.io.ItemRequest;
import in.sambhav.billingSoftware.io.ItemResponse;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

public interface ItemService {

    ItemResponse add(ItemRequest request, MultipartFile file);

    List<ItemResponse> fetchItem();

    void deleteItem(String itemId);
}
