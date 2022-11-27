package com.robeil.restfullwebapi.helloWorld.repository;

import com.robeil.restfullwebapi.helloWorld.entity.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

//    private static List<User> users = new ArrayList<>();
//    private static int userId = 0;
////    static {
////        users.add(new User(++userId, "Robeil Aregawi", LocalDate.now().minusYears(30)));
////        users.add(new User(++userId, "Meron Tekle", LocalDate.now().minusYears(20)));
////        users.add(new User(++userId, "Soliana Robeil", LocalDateTime.now().minusYears(3)));
////    }
//
//    public List<User> findAll() {
//        return users;
//    }
//    public User findUserById(int id) {
//        return users.stream()
//                .filter(user -> user.getId() == id)
//                .findFirst().orElse(null);
//    }
//
//    public void save(User user){
//        user.setId(++userId);
//        users.add(user);
//    }
//
//    public void deleteById(int id){
//        users.removeIf(user -> user.getId() == id);
//    }
}
