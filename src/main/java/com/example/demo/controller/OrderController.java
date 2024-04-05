package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;



@RestController
@RequestMapping("/order")
public class OrderController{
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public List<Order> findAllOrders() {
        return orderService.findAllOrders();
    }
	
}