package com.example.identity_service.service;

import com.example.identity_service.dto.request.AuthRequest;
import com.example.identity_service.dto.request.IntrospectRequest;
import com.example.identity_service.dto.response.AuthResponse;
import com.example.identity_service.dto.response.IntrospectResponse;
import com.nimbusds.jose.JOSEException;

import java.text.ParseException;

public interface AuthService {
    AuthResponse authenticate(AuthRequest authRequest);
    IntrospectResponse introspect(IntrospectRequest introspectRequest)
            throws JOSEException, ParseException;
}
