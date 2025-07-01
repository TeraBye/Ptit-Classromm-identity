package com.example.identity_service.service;

import com.example.identity_service.dto.request.UserRequestDTO;
import com.example.identity_service.dto.request.UserUpdateRequest;
import com.example.identity_service.entity.User;

import java.util.List;

public interface UserService {
    User createUser(UserRequestDTO userRequestDTO);
    List<User> getAllUsers();
    User getUser(int userId);
    User updateUser(int userId, UserUpdateRequest userUpdateRequest);
    void deleteUser(int userId);
};
