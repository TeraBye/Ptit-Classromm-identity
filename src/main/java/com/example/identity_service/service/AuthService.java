package com.example.identity_service.service;

import com.example.identity_service.dto.request.AuthRequest;

public interface AuthService {
    boolean authenticate(AuthRequest authRequest);
}
