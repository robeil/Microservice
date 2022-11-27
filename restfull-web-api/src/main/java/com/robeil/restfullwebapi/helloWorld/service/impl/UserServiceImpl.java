package com.robeil.restfullwebapi.helloWorld.service.impl;

import com.robeil.restfullwebapi.helloWorld.entity.User;
import com.robeil.restfullwebapi.helloWorld.repository.UserRepo;
import com.robeil.restfullwebapi.helloWorld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public void addNewUser(User user) {
        userRepo.save(user);
    }

    @Override
    public User getUserById(int id) {
        var user =  userRepo.findUserByUserId(id);
        if(!user.isPresent()){
            return null;
        } else  {
            return user.get();
        }
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public void deleteUser(int id) {
        userRepo.deleteById(id);
    }
}
