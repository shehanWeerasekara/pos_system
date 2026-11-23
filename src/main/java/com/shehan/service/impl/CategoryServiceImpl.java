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
        return List.of();
    }

    @Override
    public CategoryDto updateCategory(Long id, CategoryDto dto) {
        return null;
    }

    @Override
    public void deleteCategory(Long id) {

    }
}
