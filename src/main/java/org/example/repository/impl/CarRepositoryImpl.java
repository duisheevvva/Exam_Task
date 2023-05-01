package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import org.example.config.HibernateConfig;
import org.example.entity.Car;
import org.example.repository.CarRepository;

import java.util.List;

public class CarRepositoryImpl implements CarRepository {
    EntityManager entityManager=HibernateConfig.getEntityManager();
    @Override
    public String saveCar(Car car) {
        entityManager.getTransaction().begin();
        entityManager.persist(car);
        entityManager.getTransaction().commit();
        entityManager.close();
        return car.getName() + "is saved!";
    }

    @Override
    public Car updateCarById(Long id, Car car) {
        entityManager.getTransaction().begin();
        Car car1 = entityManager.find(Car.class, id);
        car1.setName(car.getName());
        car1.setMarka(car.getMarka());
        car1.setDate(car.getDate());
        entityManager.getTransaction().commit();
        entityManager.close();
        return car;
    }

    @Override
    public List<Car> getAllCars() {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select c from Car");
        List<Car> cars=query.getResultList();
        return cars;
    }

    @Override
    public void deleteCarById(Long id) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(Car.class,id));
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Car getCarByUserId(Long userId) {
        entityManager.getTransaction().begin();
        Car car = entityManager.find(Car.class, userId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return car;
    }

    @Override
    public List<Car> getCarsByName() {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select * from Car where name=?");
        List<Car> cars=query.getResultList();
        entityManager.getTransaction().begin();
        entityManager.close();
        return cars;
    }

}
