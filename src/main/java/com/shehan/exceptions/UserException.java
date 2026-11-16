package com.shehan.exceptions;

import com.shehan.payload.response.AuthResponse;

public class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}
