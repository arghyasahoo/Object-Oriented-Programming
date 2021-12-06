package com.oopslab.assignment;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Reservation r = new Reservation();
        r.setTotalCapacity(4);

        r.setCapacity(new HashMap<ReservationClass, Integer>() {{
            put(ReservationClass.EA, 1);
            put(ReservationClass.CC, 1);
            put(ReservationClass.TA, 2);
            put(ReservationClass.SL, 2);
            put(ReservationClass.SA, 1);
        }});

        r.reserve(new Passenger("Abc Def", 35), ReservationClass.EA);
        r.reserve(new Passenger("Fhg Ikl", 47), ReservationClass.CC);
        r.reserve(new Passenger("Fhg Ikl", 47), ReservationClass.CC);
        r.reserve(new Passenger("Pli Hst", 23), ReservationClass.TA);
        r.reserve(new Passenger("Sju Irl", 68), ReservationClass.SL);

    }
}
