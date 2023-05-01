package org.example.repository;

import org.example.entity.User;

import java.util.List;

public interface UserRepository {

    String saveUser(User user);
    User updateUserById(Long id,User user);
    List<User> getAllUser();
    void deleteUserById(Long id);
    User getUserByCarId(Long carId);


}
