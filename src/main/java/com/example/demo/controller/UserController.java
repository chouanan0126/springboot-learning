package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;




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
    public void updateUser(@PathVariable Integer id,@RequestBody User user) {
    	userService.updateUser(id,user);
    }
    
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
    	userService.deleteUser(id);
    }	

}
