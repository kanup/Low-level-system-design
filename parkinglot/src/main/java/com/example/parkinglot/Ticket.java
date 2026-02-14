package com.example.parkinglot;

import com.example.parkinglot.Entity.ParkingSpot;
import com.example.parkinglot.Entity.Vehicle;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    private final String ticketId;
    private long checkinTime;
    private long checkoutTime;
    private final Vehicle vehicle;
    private final ParkingSpot spot;


    public Ticket(Vehicle vehicle, ParkingSpot spot) {
        this.ticketId = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.spot = spot;
        this.checkinTime = System.currentTimeMillis();

    }

    public long getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(long checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public long getCheckinTime() {
        return checkinTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}