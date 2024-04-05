package com.example.demo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Order;

@Mapper
public interface OrderMapper {
	
	public List<Order> findAllOrders();
	
}