package com.robeil.restfullwebapi.helloWorld.repository;

import com.robeil.restfullwebapi.helloWorld.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
//public interface UserRepo extends MongoRepository<User, Integer> {
public interface UserRepo extends JpaRepository<User, Integer> {
    Optional<User> findUserByUserId(int id);
}
