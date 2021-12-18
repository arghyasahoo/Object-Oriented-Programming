package com.oopslab.assignment;

public class Student {
    public String name;
    public int roll;
    public Department dept;

    public Student(String name, int roll, Department dept) {
        this.name = name;
        this.roll = roll;
        this.dept = dept;
    }

    public Integer getRoll() {
        return new Integer(this.roll);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", dept=" + dept +
                '}';
    }
}
