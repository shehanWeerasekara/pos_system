package com.shehan.payload.dto;

import com.shehan.model.Store;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryDto {

    private Long id;
    private String name;
//    private Store store;
    private Long StoreId;
}
