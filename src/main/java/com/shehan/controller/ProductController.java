package com.shehan.controller;

import com.shehan.model.User;
import com.shehan.payload.dto.ProductDto;
import com.shehan.service.ProductService;
import com.shehan.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;
    private final UserService userService;

    @PostMapping
    public ResponseEntity<ProductDto> create(
            @RequestBody
            ProductDto productDto,
            @RequestHeader("Authorization")
            String jwt
    ) throws Exception {

        User user = userService.getUserFromJwtToken(jwt);
        return ResponseEntity.ok(
                productService.createProduct(
                        productDto,
                        user
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

    @PatchMapping("/{id}")
    public ResponseEntity<ProductDto> update(
            @PathVariable
            Long id,
            @RequestBody
            ProductDto productDto,
            @RequestHeader("Authorization")
            String jwt
    ) throws Exception {

        User user = userService.getUserFromJwtToken(jwt);
        return ResponseEntity.ok(
                productService.updateProduct(
                        id,
                        productDto,
                        user
                )
        );
    }
}














