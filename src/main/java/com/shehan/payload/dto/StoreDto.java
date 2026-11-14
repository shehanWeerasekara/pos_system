package com.shehan.payload.dto;

import com.shehan.domain.StoreStatus;
import com.shehan.model.StoreContact;
import com.shehan.model.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class StoreDto  {

    private long id;

    private String brand;

    private UserDto storeAdmin;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private String description;

    private String storeType;

    private StoreStatus status;

    private StoreContact contact;
}
