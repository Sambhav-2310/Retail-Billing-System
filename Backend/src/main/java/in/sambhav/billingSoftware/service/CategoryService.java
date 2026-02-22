package in.sambhav.billingSoftware.service;

import in.sambhav.billingSoftware.io.CategoryRequest;
import in.sambhav.billingSoftware.io.CategoryResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CategoryService {

    CategoryResponse add(CategoryRequest request, MultipartFile file);

    List<CategoryResponse> read();

    void delete(String categoryId);
}
