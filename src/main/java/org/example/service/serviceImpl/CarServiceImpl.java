package org.example.service.serviceImpl;

import org.example.entity.Car;
import org.example.repository.CarRepository;
import org.example.repository.impl.CarRepositoryImpl;
import org.example.service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {
    CarRepository carRepository=new CarRepositoryImpl();
    @Override
    public String saveCar(Car car) {
       return carRepository.saveCar(car);
    }

    @Override
    public Car updateCarById(Long id, Car car) {
        return carRepository.updateCarById(id,car);
    }

    @Override
    public List<Car> getAllCars() {
        return null;
    }

    @Override
    public void deleteCarById(Long id) {

    }

    @Override
    public Car getCarByUserId(Long userId) {
        return null;
    }

}
