package com.oopslab.assignment;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car(6452,2);
        Car c2 = new Car(9654,3);
        Car c3 = new Car(7682,2);
        Car c4 = new Car(8249,4);
        Car c5 = new Car(7896,1);
        Car c6 = new Car(5687,5);

	    CarParking cp = new CarParking(5);

        // Show Parking Charges for all cars
        System.out.println("Parking Charge of " + c1.getNumber() + ": " + cp.parkingCharge(c1));
        System.out.println("Parking Charge of " + c2.getNumber() + ": " + cp.parkingCharge(c2));
        System.out.println("Parking Charge of " + c3.getNumber() + ": " + cp.parkingCharge(c3));
        System.out.println("Parking Charge of " + c4.getNumber() + ": " + cp.parkingCharge(c4));
        System.out.println("Parking Charge of " + c5.getNumber() + ": " + cp.parkingCharge(c5));
        System.out.println("Parking Charge of " + c6.getNumber() + ": " + cp.parkingCharge(c6));


        // Show status of all cars

        // Status of Car 1
        System.out.println("\n\n");
        System.out.println(c1.getNumber());
        System.out.println("-------");

        System.out.println("Parking Status of Car 1: " + c1.isParked);
        try {
            cp.park(c1);
        } catch (FullParkingLot e) {
            e.printStackTrace();
        }
        System.out.println("Parking Status of Car 1: " + c1.isParked);

        if (c1.isParked) {
            System.out.println("Status of " + c1.getNumber() + ": " + c1.hasPaidCharge);
            cp.receiveParkingCharge(c1.payCharge(cp.parkingCharge(c1)));
            System.out.println("Status of " + c1.getNumber() + ": " + c1.hasPaidCharge);
        } else {
            System.out.println("Car has not been parked yet");
        }

        // Status of Car 2
        System.out.println("\n\n");
        System.out.println(c2.getNumber());
        System.out.println("-------");

        System.out.println("Parking Status of Car 2: " + c2.isParked);
        try {
            cp.park(c2);
        } catch (FullParkingLot e) {
            e.printStackTrace();
        }
        System.out.println("Parking Status of Car 2: " + c2.isParked);

        if (c2.isParked) {
            System.out.println("Status of " + c2.getNumber() + ": " + c2.hasPaidCharge);
            cp.receiveParkingCharge(c2.payCharge(cp.parkingCharge(c2)));
            System.out.println("Status of " + c2.getNumber() + ": " + c2.hasPaidCharge);
        } else {
            System.out.println("Car has not been parked yet");
        }

        // Status of Car 3
        System.out.println("\n\n");
        System.out.println(c3.getNumber());
        System.out.println("-------");

        System.out.println("Parking Status of Car 3: " + c3.isParked);
        try {
            cp.park(c3);
        } catch (FullParkingLot e) {
            e.printStackTrace();
        }
        System.out.println("Parking Status of Car 3: " + c3.isParked);

        if (c3.isParked) {
            System.out.println("Status of " + c3.getNumber() + ": " + c3.hasPaidCharge);
            cp.receiveParkingCharge(c3.payCharge(cp.parkingCharge(c3)));
            System.out.println("Status of " + c3.getNumber() + ": " + c3.hasPaidCharge);
        } else {
            System.out.println("Car has not been parked yet");
        }

        // Status of Car 4
        System.out.println("\n\n");
        System.out.println(c4.getNumber());
        System.out.println("-------");

        System.out.println("Parking Status of Car 4: " + c4.isParked);
        try {
            cp.park(c4);
        } catch (FullParkingLot e) {
            e.printStackTrace();
        }
        System.out.println("Parking Status of Car 4: " + c4.isParked);

        if (c4.isParked) {
            System.out.println("Status of " + c4.getNumber() + ": " + c4.hasPaidCharge);
            cp.receiveParkingCharge(c4.payCharge(cp.parkingCharge(c4)));
            System.out.println("Status of " + c4.getNumber() + ": " + c4.hasPaidCharge);
        } else {
            System.out.println("Car has not been parked yet");
        }

        // Status of Car 5
        System.out.println("\n\n");
        System.out.println(c5.getNumber());
        System.out.println("-------");

        System.out.println("Parking Status of Car 5: " + c5.isParked);
        try {
            cp.park(c5);
        } catch (FullParkingLot e) {
            e.printStackTrace();
        }
        System.out.println("Parking Status of Car 5: " + c5.isParked);

        if (c5.isParked) {
            System.out.println("Status of " + c5.getNumber() + ": " + c5.hasPaidCharge);
            cp.receiveParkingCharge(c5.payCharge(cp.parkingCharge(c5)));
            System.out.println("Status of " + c5.getNumber() + ": " + c5.hasPaidCharge);
        } else {
            System.out.println("Car has not been parked yet");
        }

        // Status of Car 6
        System.out.println("\n\n");
        System.out.println(c6.getNumber());
        System.out.println("-------");

        System.out.println("Parking Status of Car 6: " + c6.isParked);
        try {
            cp.park(c6);
        } catch (FullParkingLot e) {
            e.printStackTrace();
        }
        System.out.println("Parking Status of Car 6: " + c6.isParked);

        if (c6.isParked) {
            System.out.println("Status of " + c6.getNumber() + ": " + c6.hasPaidCharge);
            cp.receiveParkingCharge(c6.payCharge(cp.parkingCharge(c6)));
            System.out.println("Status of " + c6.getNumber() + ": " + c6.hasPaidCharge);
        } else {
            System.out.println("Car has not been parked yet");
        }

        // Total cars present in the parking lot
        System.out.println("\n");
        System.out.println("Total Cars Parked in the Parking Lot: " + cp.totalCarsParked);
        System.out.println("Total Parking Charge Collected: " + cp.totalParkingCharge);
    }
}
