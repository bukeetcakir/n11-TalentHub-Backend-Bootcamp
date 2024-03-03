package com.bukeetcakir.ordermanagementapp.service;

import com.bukeetcakir.ordermanagementapp.entity.Customer;

import java.util.List;

public interface CustomerService {

    void addCustomer(Customer customer);
    List<Customer> getAllCustomers();
    List<Customer> getCustomersWithLetter(String letter);
}
