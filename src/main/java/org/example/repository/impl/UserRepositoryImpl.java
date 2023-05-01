package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.example.config.HibernateConfig;
import org.example.entity.User;
import org.example.repository.UserRepository;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    EntityManager entityManager= HibernateConfig.getEntityManager();
    @Override
    public String saveUser(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
        return user.getFirst_name() + "is saved!";
    }

    @Override
    public User updateUserById(Long id, User user) {
        entityManager.getTransaction().begin();
        User user1 = entityManager.find(User.class, id);
        user1.setFirst_name(user.getFirst_name());
        user1.setLast_name(user.getLast_name());
        user1.setAge(user.getAge());
        entityManager.getTransaction().commit();
        entityManager.close();
        return user;
    }



    @Override
    public List<User> getAllUser() {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select * from User");
        List<User> users=query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return users;

    }

    @Override
    public void deleteUserById(Long id) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(User.class,id));
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public User getUserByCarId(Long carId) {
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, carId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return user;
    }
}
