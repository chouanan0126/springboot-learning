package com.example.demo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.User;

@Mapper
public interface UserMapper {
   
    public User getUserById(Integer id);

    public List<User> findAllUsers();
    
    public void insertUser(User user);

     public void updateUser(User user);

     public Integer deleteUser(Integer id);
}
