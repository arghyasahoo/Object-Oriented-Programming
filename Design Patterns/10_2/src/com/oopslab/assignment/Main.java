package com.oopslab.assignment;

public class Main {

    public static void main(String[] args) {
        // Set total Number of objects to create
        Demo.createMax(3);

	    // 1st Object
        Demo d1 = Demo.createObject();
        System.out.println("a = " + d1.a);

        // 2nd Object
	    Demo d2 = Demo.createObject();
        System.out.println("a = " + d2.a);

        // 3rd Object
	    Demo d3 = Demo.createObject();
        System.out.println("a = " + d3.a);

        // Null Reference
	    Demo d4 = Demo.createObject();
        System.out.println("a = " + d4.a);

    }
}
