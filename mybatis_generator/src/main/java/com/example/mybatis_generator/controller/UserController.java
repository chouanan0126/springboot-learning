package com.example.mybatis_generator.controller;

import com.example.mybatis_generator.entity.User;
import com.example.mybatis_generator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public void insertUser(@RequestBody User user) {
        userService.insertUser(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Integer id, @RequestBody User user) {
        userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
}

