package com.shehan.exceptions;

import com.shehan.payload.response.AuthResponse;

public class UserException extends Throwable {
    public UserException(String message) {
        super(message);
    }
}
