package com.example.identity_service.service.Impl;

import com.example.identity_service.dto.request.UserRequestDTO;
import com.example.identity_service.dto.request.UserUpdateRequest;
import com.example.identity_service.entity.User;
import com.example.identity_service.exception.AppException;
import com.example.identity_service.exception.ErrorCode;
import com.example.identity_service.repository.UserRepository;
import com.example.identity_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User createUser(UserRequestDTO userRequestDTO){
        if(userRepository.existsByUsername(userRequestDTO.getUsername())){
            throw new AppException(ErrorCode.USER_EXISTED);
        }
        User user = User.builder()
                .username(userRequestDTO.getUsername())
                .email(userRequestDTO.getEmail())
                .password(userRequestDTO.getPassword())
                .fullName(userRequestDTO.getFullName())
                .dob(Date.valueOf(userRequestDTO.getDob()).toLocalDate())
                .build();

        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("user not found"));
    }

    @Override
    public User updateUser(int userId, UserUpdateRequest userUpdateRequest) {
        User user = getUser(userId);

        user.setFullName(userUpdateRequest.getFullName());
        user.setEmail(userUpdateRequest.getEmail());
        user.setPassword(userUpdateRequest.getPassword());
        return  userRepository.save(user);
    }

    @Override
    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }
}
