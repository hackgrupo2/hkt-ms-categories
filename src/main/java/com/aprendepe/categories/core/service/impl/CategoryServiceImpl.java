package com.aprendepe.categories.core.service.impl;

import com.aprendepe.categories.core.dto.CategoryDto;
import com.aprendepe.categories.core.entity.Category;
import com.aprendepe.categories.core.exception.CategoryNotFoundException;
import com.aprendepe.categories.core.repository.CategoryRepository;
import com.aprendepe.categories.core.service.CategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public CategoryDto getCategory(Integer categoryId) {
        CategoryDto dto = new CategoryDto();
        Category category = categoryRepository
                .findById(categoryId).orElseThrow(() -> new CategoryNotFoundException());
        BeanUtils.copyProperties(category, dto);

        return dto;
    }

    @Override
    public List<CategoryDto> getCategories() {
        List<CategoryDto> list = new ArrayList<>();

        categoryRepository.findAll().forEach(
                entity -> {
                    CategoryDto dto = new CategoryDto();
                        BeanUtils.copyProperties(entity, dto);
                    list.add(dto);
                }
        );

        return list;
    }

    @Override
    public void saveCategory(CategoryDto dto) {
        Category student = new Category();
        BeanUtils.copyProperties(dto, student);
        categoryRepository.save(student);
    }

    @Override
    public void deleteCategory(Integer categoryId) {
        categoryRepository.deleteById(categoryId);
    }

}
