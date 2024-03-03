package com.bukeetcakir.ordermanagementapp.service.impl;

import com.bukeetcakir.ordermanagementapp.entity.Customer;
import com.bukeetcakir.ordermanagementapp.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private final List<Customer> customerList;

    public CustomerServiceImpl(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerList;
    }

    @Override
    public List<Customer> getCustomersWithLetter(String letter) {
        return customerList.stream().filter(customer -> customer.getName().contains("C") || customer.getName().contains("c"))
                .toList();
    }
}
