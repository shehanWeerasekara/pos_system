package com.shehan.service.impl;

import com.shehan.model.Store;
import com.shehan.model.User;
import com.shehan.payload.dto.StoreDto;
import com.shehan.repository.StoreRepository;
import com.shehan.service.StoreService;
import com.shehan.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;
    private final UserService userService;
    @Override
    public StoreDto createStore(StoreDto storeDto, User user) {
        return null;
    }

    @Override
    public StoreDto getStoreById(Long id) {
        return null;
    }

    @Override
    public List<StoreDto> getAllStores() {
        return List.of();
    }

    @Override
    public Store getStoreByAdmin() {
        return null;
    }

    @Override
    public StoreDto updateStore(Long id, StoreDto storeDto) {
        return null;
    }

    @Override
    public StoreDto deleteStore(Long id) {
        return null;
    }

    @Override
    public StoreDto getStoreByEmployee() {
        return null;
    }
}
