package com.shehan.service.impl;

import com.shehan.mapper.ProductMapper;
import com.shehan.model.Product;
import com.shehan.model.Store;
import com.shehan.model.User;
import com.shehan.payload.dto.ProductDto;
import com.shehan.repository.ProductRepository;
import com.shehan.repository.StoreRepository;
import com.shehan.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final StoreRepository storeRepository;

    @Override
    public ProductDto createProduct(ProductDto productDto, User user) throws Exception {
        Store store = storeRepository.findById(
                productDto.getStoreId()
        ).orElseThrow(
                () -> new Exception("store not found")
        );

        Product product = ProductMapper.toEntity(productDto, store);
        Product saveProduct = productRepository.save(product);
        return ProductMapper.toDto(saveProduct);
    }

    @Override
    public ProductDto updateProduct(Long id, ProductDto productDto, User user) {
        return null;
    }

    @Override
    public void deleteProduct(Long id, User user) {

    }

    @Override
    public List<ProductDto> getProductsByStoreId(Long storeId) {
        return List.of();
    }

    @Override
    public List<ProductDto> searchByKeyword(Long storeId, String keyword) {
        return List.of();
    }
}




















