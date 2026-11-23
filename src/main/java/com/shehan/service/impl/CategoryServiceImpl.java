package com.shehan.service.impl;

import com.shehan.exceptions.UserException;
import com.shehan.mapper.CategoryMapper;
import com.shehan.model.Category;
import com.shehan.model.Store;
import com.shehan.model.User;
import com.shehan.payload.dto.CategoryDto;
import com.shehan.repository.CategoryRepository;
import com.shehan.repository.StoreRepository;
import com.shehan.service.CategoryService;
import com.shehan.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final UserService userService;
    private final StoreRepository storeRepository;

    @Override
    public CategoryDto createCategory(CategoryDto dto) throws Exception {

        User user = userService.getCurrentUser();
        Store store = storeRepository.findById(dto.getStoreId()).orElseThrow(
                () -> new Exception("Store not foud")
        );

        Category category = Category.builder()
                .store(store)
                .name(dto.getName())
                .build();

        return CategoryMapper.toDto(category);
    }

    @Override
    public List<CategoryDto> getCategoriesByStore(Long storeId) {

        List<Category> categories = categoryRepository.findByStoreId(storeId);
        return categories.stream().map(CategoryMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public CategoryDto updateCategory(Long id, CategoryDto dto) throws Exception {
        Category category = categoryRepository.findById(id).orElseThrow(
                () -> new Exception("category not found")
        );

        User user = userService.getCurrentUser();

        category.setName(dto.getName());

        return CategoryMapper.toDto(categoryRepository.save(category));
    }

    @Override
    public void deleteCategory(Long id) throws Exception {
        Category category = categoryRepository.findById(id).orElseThrow(
                () -> new Exception("category not found")
        );

        User user = userService.getCurrentUser();

        categoryRepository.delete(category);
    }
}










