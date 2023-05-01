package org.example.service;

import org.example.entity.User;

import java.util.List;

public interface UserService {
    String saveUser(User user);
    User updateUserById(Long id,User user);
    List<User> getAllUser();
    void deleteUserById(Long id);
    User getUserByCarId(Long carId);
}
