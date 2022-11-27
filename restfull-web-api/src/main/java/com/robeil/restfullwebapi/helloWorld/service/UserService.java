package com.robeil.restfullwebapi.helloWorld.service;

import com.robeil.restfullwebapi.helloWorld.entity.User;

import java.util.List;

public interface UserService {

    void addNewUser(User user);
    User getUserById(int id);

    List<User> getAllUsers();

    void deleteUser(int id);
}
