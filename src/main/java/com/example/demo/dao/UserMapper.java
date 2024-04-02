package com.example.demo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.entity.User;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user WHERE id = #{id}")
    public User getUserById(Integer id);

    @Select("SELECT * FROM user")
    public List<User> findAllUsers();
    
    @Insert("INSERT INTO user (name, age, gender, phone) VALUES (#{name}, #{age}, #{gender}, #{phone})")
    public void insertUser(User user);

    @Update("UPDATE user SET name=#{name}, age=#{age}, gender=#{gender}, phone=#{phone} WHERE id=#{id}")
     public void updateUser(User user);

     public Integer deleteUser(Integer id);
}
