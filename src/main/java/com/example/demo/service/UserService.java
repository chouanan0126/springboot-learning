package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;


public interface UserService {

    public User getUserById(Integer id);

    public List<User> findAllUsers();

    public void insertUser(User user);

    public void updateUser(Integer id, User user);

    public void deleteUser(Integer id);
}
