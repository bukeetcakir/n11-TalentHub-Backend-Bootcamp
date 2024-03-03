package com.bukeetcakir.ordermanagementapp;


import com.bukeetcakir.ordermanagementapp.entity.Customer;
import com.bukeetcakir.ordermanagementapp.entity.Invoice;
import com.bukeetcakir.ordermanagementapp.entity.Order;
import com.bukeetcakir.ordermanagementapp.service.impl.CustomerServiceImpl;
import com.bukeetcakir.ordermanagementapp.service.impl.InvoiceServiceImpl;
import com.bukeetcakir.ordermanagementapp.service.impl.OrderServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class OrderManagementApp {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Ala", "Tech", LocalDate.of(2023, 4, 3));
        Customer customer2 = new Customer("Can", "Construction", LocalDate.of(2020, 6, 3));
        Customer customer3 = new Customer("Cem", "Tech", LocalDate.of(2023, 6, 3));
        Customer customer4 = new Customer("Ada", "Economy", LocalDate.of(2023, 4, 8));

        Order order1 = new Order(customer1);
        Order order2 = new Order(customer2);
        Order order3 = new Order(customer3);
        Order order4 = new Order(customer4);

        Invoice invoice1 = new Invoice(LocalDate.of(2024, 6, 3), 2000.00, order1);
        Invoice invoice2 = new Invoice(LocalDate.of(2024, 5, 3), 1550.50, order2);
        Invoice invoice3 = new Invoice(LocalDate.of(2024, 8, 3), 250.00, order3);
        Invoice invoice4 = new Invoice(LocalDate.of(2024, 6, 3), 700.00, order4);

        CustomerServiceImpl customerService = new CustomerServiceImpl(Arrays.asList(customer1, customer2, customer3, customer4));
        OrderServiceImpl orderService = new OrderServiceImpl(Arrays.asList(order1, order2, order3, order4));
        InvoiceServiceImpl invoiceService = new InvoiceServiceImpl(Arrays.asList(invoice1, invoice2, invoice3, invoice4));

        // All customers list
        System.out.println("Customers: " + customerService.getAllCustomers());

        // List of customers containing the letter 'C'
        System.out.println("Customers containing the letter 'C': " + customerService.getCustomersWithLetter("C"));

        // Listing the total amount of invoices for customers registered in June
        System.out.println("Total invoices of customers registered in June: " + invoiceService.getTotalAmountOfInvoicesForCustomersRegistrationInMonth(6));

        // All invoices list
        System.out.println("Invoices: " + invoiceService.getAll());

        // List of invoices above 1500 TL
        System.out.println("Invoices above 1500 TL: " + invoiceService.getInvoicesWithTotalAmountGreaterThan(1500.00));

        // Calculating the average of invoices above 1500 TL
        System.out.println("Average of invoices above 1500 TL: " + invoiceService.calculateAverageAmountOfInvoicesAbove(1500.00));

        // List of customers' names with invoices below 500 TL
        System.out.println("Customers with invoices below 500 TL: " + invoiceService.getCustomersWithInvoicesBelow(500.00));

        // List of the industries of companies with average invoices below 750 in June
        System.out.println("Industries of companies with average invoices below 750 TL in June: " + invoiceService.listIndustriesWithInvoiceAverageBelowInMonth(6,750.00));

    }

}
