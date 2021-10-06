package com.rsjavasolutions.exceptionhandler.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CarNotFoundException extends RuntimeException {

    private final static String MESSAGE = "Can't find car with uuid: %s";

    public CarNotFoundException(String uuid) {
        super(String.format(MESSAGE, uuid));
    }
}
