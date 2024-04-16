package com.example.mybatis_generator.service;

import com.example.mybatis_generator.entity.User;

import java.util.List;

public interface UserService {
    public User getUserById(Integer id);

    public List<User> findAllUsers();

    public void insertUser(User user);

    public void updateUser(Integer id, User user);

    public void deleteUser(Integer id);
}
