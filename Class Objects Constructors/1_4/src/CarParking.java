package com.oopslab.assignment;

public class CarParking {
    public int noOfCarsPresent;
    public int totalCarsParked;
    public double totalParkingCharge = 0.0;

    private final int rate = 50;  // charge per hour
    private final int totalParkingSpots;

    public CarParking(int totalParkingSpots) {
        this.totalParkingSpots = totalParkingSpots;
    }

    public double parkingCharge(Car car) {
        return rate * car.hrsOfBooking;
    }

    public void receiveParkingCharge(double charge) {
        totalParkingCharge += charge;
    }

    public void park(Car car) throws FullParkingLot {
        if (totalParkingSpots - totalCarsParked > 0) {
            totalCarsParked += 1;
            car.isParked = true;
        }
        else
            throw new FullParkingLot();
    }

    public void exit(Car car) {
        totalCarsParked -= 1;
    }
}
