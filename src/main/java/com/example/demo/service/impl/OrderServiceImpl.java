package com.example.demo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrderMapper;
import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public List<Order> findAllOrders() {
		return orderMapper.findAllOrders();
	}
}