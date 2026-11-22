package com.shehan.controller;

import com.shehan.payload.dto.ProductDto;
import com.shehan.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDto> create(
            @RequestBody
            ProductDto productDto,
            @RequestHeader("Authorization")
            String jwt
    ) throws Exception {
        return ResponseEntity.ok(
                productService.createProduct(
                        productDto, null
                )
        );
    }

    @GetMapping("/store/{storeId}")
    public ResponseEntity<List<ProductDto>> getByStoreId(
            @PathVariable
            Long storeId,
            @RequestHeader("Authorization")
            String jwt
    ) throws Exception {
        return ResponseEntity.ok(
                productService.getProductsByStoreId(storeId)
        );
    }
}














