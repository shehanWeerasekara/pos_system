package com.shehan.mapper;

import com.shehan.model.Category;
import com.shehan.payload.dto.CategoryDto;

public class CategoryMapper {
    public static CategoryDto toDto(Category category) {
        return CategoryDto.builder()
                .id(category.getId())
                .name(category.getName())
                .StoreId(category.getStore() != null ? category.getStore().getId() : null)
                .build();
    }
}
