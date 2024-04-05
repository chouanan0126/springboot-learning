package com.example.demo.entity;

import lombok.Data;

import java.sql.Timestamp;


@Data
public class Order {
    private Integer id;
    private Integer userId;
    private Timestamp orderDate;
    private Double totalAmount;
    private Byte orderStatus;

    private User user;

    public Order() {
    }

    public Order(Integer id, Integer userId, Timestamp orderDate, Double totalAmount, Byte orderStatus, User user) {
        this.id = id;
        this.userId = userId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
        this.user = user;
    }
}