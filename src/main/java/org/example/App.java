package org.example;

import org.example.config.HibernateConfig;
import org.example.entity.Car;
import org.example.entity.User;
import org.example.service.CarService;
import org.example.service.UserService;
import org.example.service.serviceImpl.CarServiceImpl;
import org.example.service.serviceImpl.UserServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

//        HibernateConfig.getEntityManager();
        CarService carService=new CarServiceImpl();
//        carService.saveCar(new Car("Fit","Honda",2021));
//        carService.updateCarById(1L,new Car("Camry350","Tayota",2023));
//        carService.getAllCars();
//        carService.deleteCarById(1L);
//        carService.getCarByUserId(2L);
//        carService.getCarsByName();
        UserService userService=new UserServiceImpl();
//        userService.saveUser(new User("John","Li",30));
//        userService.updateUserById(1L);
//        userService.getAllUser();
//        userService.deleteUserById(1L);
//        userService.getUserByCarId(1L);




    }
}
