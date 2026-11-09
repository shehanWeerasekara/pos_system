package com.shehan.service;

import com.shehan.exceptions.UserException;
import com.shehan.payload.dto.UserDto;
import com.shehan.payload.response.AuthResponse;

public interface AuthService {

    AuthResponse signup(UserDto userDto) throws UserException;
    AuthResponse login(UserDto userDto) throws UserException;
}
