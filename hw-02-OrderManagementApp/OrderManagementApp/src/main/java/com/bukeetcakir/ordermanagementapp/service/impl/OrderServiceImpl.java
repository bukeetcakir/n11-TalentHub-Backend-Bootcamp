package com.bukeetcakir.ordermanagementapp.service.impl;

import com.bukeetcakir.ordermanagementapp.entity.Order;
import com.bukeetcakir.ordermanagementapp.service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    private final List<Order> orders;

    public OrderServiceImpl (List<Order> orders) {
        this.orders = orders;
    }

}
