package com.oopslab.assignment;

public class Car {
    private int number;
    public int hrsOfBooking;
    public boolean isParked = false;

    public boolean hasPaidCharge = false;

    public Car(int number, int hours) {
        this.number = number;
        hrsOfBooking = hours;
    }

    public double payCharge(double chargeToPay) {
        hasPaidCharge = true;
        return chargeToPay;
    }

    public int getNumber() {
        return this.number;
    }
}
