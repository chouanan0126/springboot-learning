package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.entity.UserExample;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        UserExample example = new UserExample();
        example.createCriteria().andIdEqualTo(id);
        List<User> userList = userMapper.selectByExample(example);
        return userList.isEmpty() ? null : userList.get(0);
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
