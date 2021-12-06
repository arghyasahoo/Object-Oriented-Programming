package com.oopslab.assignment;

public class Triangle extends Shape {
    public double height;
    public double base;

    @Override
    public double calculateArea() {
        return 0.5 * height * base;
    }

    @Override
    public void display(double area) {
        System.out.println("Area of this triangle with height = " + height + " base = " + base + " is = " + area);
    }
}
