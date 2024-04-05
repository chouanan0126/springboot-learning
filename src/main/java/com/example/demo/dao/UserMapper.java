package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User getUserById(Integer id);

    List<User> findAllUsers();

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(Integer id);
}
