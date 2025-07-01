package com.example.identity_service.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION("uncategorized exception", 9999),
    USER_EXISTED("User existed", 1002),
    INVALID_KEY("Invalid key", 1001),
    INVALID_USERNAME("Username must be at least 5 characters", 1003),
    INVALID_PASSWORD("Password must be at least 8 characters", 1004);


    private final String message;
    private final int code;
}
