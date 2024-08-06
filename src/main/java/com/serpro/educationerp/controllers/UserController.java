package com.serpro.educationerp.controllers;

import com.serpro.educationerp.models.User;
import com.serpro.educationerp.models.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public Iterable<User> findAllUsers() {
        return this.userRepository.findAll();
    }

    @PostMapping("/addUser")
    public User addOneUser(@RequestBody User user) {
        return this.userRepository.save(user);
    }
}
