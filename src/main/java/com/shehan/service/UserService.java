package com.shehan.service;

import com.shehan.exceptions.UserException;
import com.shehan.model.User;

import java.util.List;

public interface UserService {

    User getUserFromJwtToken(String token) throws UserException;
    User getCurrentUser() throws UserException;
    User getUserByEmail(String email) throws UserException;
    User getUserById(long id) throws Exception;
    List<User> getAllUsers();
}
