package com.bukeetcakir.ordermanagementapp.service;

import com.bukeetcakir.ordermanagementapp.entity.Invoice;

import java.util.List;

public interface InvoiceService {
    List<Invoice> getAll();

    void add(Invoice customer);
    List<Invoice> getInvoicesWithTotalAmountGreaterThan(double amount);
    double calculateAverageAmountOfInvoicesAbove(double thresholdAmount);
    List<String> getCustomersWithInvoicesBelow(double thresholdAmount);
    List<String> listIndustriesWithInvoiceAverageBelowInMonth(int month, double thresholdAmount);
    double getTotalAmountOfInvoicesForCustomersRegistrationInMonth(int month);
}
