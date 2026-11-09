package com.shehan.payload.response;

import com.shehan.payload.dto.UserDto;
import lombok.Data;

@Data
public class AuthResponse {

    private String jwt;
    private String message;
    private UserDto user;

    public AuthResponse() {
        this.message = message;
    }
}
