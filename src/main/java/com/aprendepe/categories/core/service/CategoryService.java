package com.aprendepe.categories.core.service;

import com.aprendepe.categories.core.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    CategoryDto getCategory(Integer categoryId);
    List<CategoryDto> getCategories();
    void saveCategory(CategoryDto dto);
    void deleteCategory(Integer categoryId);

}
