package com.rsjavasolutions.exceptionhandler.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CarResponse {
    private String uuid;
    private long id;
    private String band;
    private String model;
}
