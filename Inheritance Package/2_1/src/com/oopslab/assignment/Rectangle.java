package com.oopslab.assignment;

public class Rectangle extends Shape {
    public double length;
    public double breadth;

    @Override
    public double calculateArea() {
        return length * breadth;
    }

    @Override
    public void display(double area) {
        System.out.println("Area of this rectangle with length = " + length + " breadth = " + breadth + " is = " + area);
    }
}
