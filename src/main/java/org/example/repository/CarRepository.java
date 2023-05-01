package org.example.repository;

import org.example.entity.Car;

import java.util.List;

public interface CarRepository {

    String saveCar(Car car);
    Car updateCarById(Long id,Car car);
    List<Car> getAllCars();
    void deleteCarById(Long id);

    Car getCarByUserId(Long userId);
    List<Car> getCarsByName();


}
