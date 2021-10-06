package com.rsjavasolutions.exceptionhandler.mapper;

import com.rsjavasolutions.exceptionhandler.model.CarEntity;
import com.rsjavasolutions.exceptionhandler.model.CarRequest;
import com.rsjavasolutions.exceptionhandler.model.CarResponse;

public class CarMapper {

    public static CarEntity mapToEntity(CarRequest request) {
        return new CarEntity(
                request.getBrand(),
                request.getModel());
    }

    public static CarResponse mapToResponse(CarEntity carEntity) {
        return new CarResponse(
                carEntity.getUuid(),
                carEntity.getId(),
                carEntity.getBrand(),
                carEntity.getModel());
    }
}
