package com.example.parkinglot;

import com.example.parkinglot.Entity.Vehicle;

public class ExitGate {
    private final InvoiceManager invoiceManager;
    public ExitGate(InvoiceManager invoiceManager){
        this.invoiceManager=invoiceManager;
    }
    public double processExit(Ticket ticket){
        ticket.setCheckoutTime(System.currentTimeMillis());
        return invoiceManager.calculateBill(ticket);
    }

}
