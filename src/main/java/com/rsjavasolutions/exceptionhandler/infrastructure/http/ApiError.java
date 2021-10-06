package com.rsjavasolutions.exceptionhandler.infrastructure.http;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ApiError {
    private String message;
    private String exception;
    private String identifier;
    private final LocalDateTime localDateTime = LocalDateTime.now();
    private final String stackTrace;
}