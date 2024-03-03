package com.bukeetcakir.ordermanagementapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Customer customer;

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                '}';
    }
}
