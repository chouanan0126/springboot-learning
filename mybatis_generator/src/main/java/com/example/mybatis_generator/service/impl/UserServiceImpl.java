package com.example.mybatis_generator.service.impl;

import com.example.mybatis_generator.dao.UserMapper;
import com.example.mybatis_generator.entity.User;
import com.example.mybatis_generator.entity.UserExample;
import com.example.mybatis_generator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> findAllUsers() {
        UserExample example = new UserExample();
        return userMapper.selectByExample(example);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void updateUser(Integer id, User user) {
        UserExample example = new UserExample();
        example.createCriteria().andIdEqualTo(id);
        userMapper.updateByExampleSelective(user, example);
    }

    @Override
    public void deleteUser(Integer id) {
        UserExample example = new UserExample();
        example.createCriteria().andIdEqualTo(id);
        userMapper.deleteByExample(example);
    }
}
