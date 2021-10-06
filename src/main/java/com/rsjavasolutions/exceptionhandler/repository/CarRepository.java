package com.rsjavasolutions.exceptionhandler.repository;

import com.rsjavasolutions.exceptionhandler.model.CarEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CarRepository extends CrudRepository<CarEntity, Long> {

    List<CarEntity> findAll();

    Optional<CarEntity> findByUuid(String uuid);

    void deleteByUuid(String uuid);
}
