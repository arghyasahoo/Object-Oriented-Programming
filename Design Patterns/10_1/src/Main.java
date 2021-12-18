package com.oopslab.assignment;

public class Main {

    public static void main(String[] args) {
	    // Only one object can be created
        Demo d = Demo.createObject();
        System.out.println("a = " + d.a);

        // Null Reference
	    Demo d1 = Demo.createObject();
        System.out.println("a = " + d1.a);
    }
}
