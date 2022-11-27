package com.robeil.restfullwebapi.helloWorld.controller;

import com.robeil.restfullwebapi.helloWorld.entity.User;
import com.robeil.restfullwebapi.helloWorld.repository.UserRepo;
import com.robeil.restfullwebapi.helloWorld.repository.UserRepository;
import com.robeil.restfullwebapi.helloWorld.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserJPAController {

    @Autowired
    private UserService userService;

    @GetMapping("/jpa/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * using hateous for adding link to return type
     * @param id
     * @return
     */
    @GetMapping("/jpa/users/{id}")
    public User getUser(@PathVariable int id) {
         User user =  userService.getUserById(id);
        System.out.println("Getting use with id : " + id);
        System.out.println(user);
         return user;
//        if(user == null)
////            throw new UserNotFoundException("Id : " + id +" not found");
//        EntityModel<User> entityModel = EntityModel.of(user);
//        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllUsers());
//        entityModel.add(link.withRel("all-users"));
//        return entityModel;
    }

    @PostMapping("/jpa/users")
    public void addNewUser(@RequestBody User user) {
        userService.addNewUser(user);
        System.out.println("Saving use with id : " + user.getUserId());
        System.out.println(user);
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(user.getUserId())
//                .toUri();
//        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/jpa/users/{id}")
    public void removeUser(@PathVariable int id){
        userService.deleteUser(id);
    }
}
