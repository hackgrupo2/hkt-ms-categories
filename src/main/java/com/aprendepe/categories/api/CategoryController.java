package com.aprendepe.categories.api;

import com.aprendepe.categories.core.dto.CategoryDto;
import com.aprendepe.categories.core.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/category")
public class CategoryController extends BaseController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/{categoryId}")
    public ResponseEntity getCategory(@PathVariable Integer categoryId) {
        return buildSuccessResponse(categoryService.getCategory(categoryId));
    }

    @GetMapping
    public ResponseEntity getStudents() {
        return buildSuccessResponse(categoryService.getCategories());
    }

    @PostMapping
    public ResponseEntity saveStudent(@RequestBody CategoryDto dto) {
        categoryService.saveCategory(dto);
        return buildSuccessResponse();
    }

    @PutMapping
    public ResponseEntity updateStudents(@RequestBody CategoryDto dto) {
        categoryService.saveCategory(dto);
        return buildSuccessResponse();
    }

    @DeleteMapping("/{categoryId}")
    public ResponseEntity deleteStudent(@PathVariable Integer categoryId) {

        categoryService.deleteCategory(categoryId);
        return buildSuccessResponse();
    }

}
