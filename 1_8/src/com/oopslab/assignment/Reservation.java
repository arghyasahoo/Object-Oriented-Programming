package com.oopslab.assignment;

import java.util.HashMap;

public class Reservation {
    private int capacity;
    private HashMap<ReservationClass, Integer> cap = new HashMap<>();

    public void reserve(Passenger p, ReservationClass rClass) {
        p.rClass = rClass;
        try {
            assignSeats(p);
        } catch (SeatsFull e) {
            e.printStackTrace();
        }
    }

    public void assignSeats(Passenger pass) throws SeatsFull {
        if (cap.get(pass.rClass) > 0 && capacity > 0) {
            cap.put(pass.rClass, cap.get(pass.rClass) - 1);
        } else {
            throw new SeatsFull("All seats are full");
        }
    }

    protected void setTotalCapacity(int capacity) {
        this.capacity = capacity;
    }

    protected void setCapacity(HashMap<ReservationClass, Integer> cap) {
        this.cap = cap;
    }
}
