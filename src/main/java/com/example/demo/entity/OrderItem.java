package com.example.demo.entity;

import lombok.Data;

@Data
public class OrderItem {
    private Integer orderItem;
    private Integer productId;
    private Integer orderId;
    private Integer quantity;

    private Product product;
}
