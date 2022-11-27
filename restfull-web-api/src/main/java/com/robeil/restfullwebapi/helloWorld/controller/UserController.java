package com.robeil.restfullwebapi.helloWorld.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
//    @Autowired
//    private UserRepository userRepository;
//
//    @GetMapping("/users")
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    /**
//     * using hateous for adding link to return type
//     * @param id
//     * @return
//     */
//    @GetMapping("/users/{id}")
//    public EntityModel<User> getUser(@PathVariable int id) {
//        User user =  userRepository.findUserById(id);
//        if(user == null)
//            throw new UserNotFoundException("Id : " + id +" not found");
//        EntityModel<User> entityModel = EntityModel.of(user);
//        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllUsers());
//        entityModel.add(link.withRel("all-users"));
//        return entityModel;
//    }
//
//    @PostMapping("/users")
//    public ResponseEntity<User> addNewUser(@Valid @RequestBody User user) {
//        userRepository.save(user);
//
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(user.getId())
//                .toUri();
//        return ResponseEntity.created(location).build();
//    }
//
//    @DeleteMapping("/users/{id}")
//    public void removeUser(@PathVariable int id){
//         userRepository.deleteById(id);
//    }
}
