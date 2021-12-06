package com.oopslab.assignment;

public class Main {

    public static void main(String[] args) {
	    Rectangle rc = new Rectangle();
        Triangle tr = new Triangle();

        rc.length = 10;
        rc.breadth = 5;

        double area = rc.calculateArea();
        rc.display(area);

        tr.height = 10;
        tr.base = 5;

        area = tr.calculateArea();
        tr.display(area);
    }
}
