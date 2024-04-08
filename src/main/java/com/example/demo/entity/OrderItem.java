package com.example.demo.entity;

import lombok.Data;

@Data
public class OrderItem {
    private Integer orderItemId;
    private Integer productId;
    private Integer orderId;
    private Integer quantity;

    private Product product;
}
