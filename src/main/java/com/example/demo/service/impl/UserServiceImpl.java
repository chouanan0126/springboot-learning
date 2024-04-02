package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAllUsers();

    }

     @Override
     public void insertUser(User user) {
         userMapper.insertUser(user);
     }

     @Override
     public void updateUser(Integer id,User user) {
    	 user.setId(id);
         userMapper.updateUser(user);
     }

     @Override
     public void deleteUser(Integer id) {
         userMapper.deleteUser(id);
     }
    
}