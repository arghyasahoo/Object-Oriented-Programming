package com.oopslab.assignment;

public class Teacher extends Person {
    private double salary;

    public Teacher(String name, Department dept) {
        super.setName(name);
        super.setDept(dept);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name = " + super.getName() +
                " department = " + super.getDept() +
                " salary = " + getSalary() +
                '}';
    }
}
