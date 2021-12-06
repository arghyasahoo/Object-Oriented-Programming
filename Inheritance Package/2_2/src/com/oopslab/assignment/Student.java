package com.oopslab.assignment;

public class Student extends Person {
    private static long autoInc = 18700119000L;
    private final long rollNo;
    private double grade;

    public Student(String name, Department dept) {
        rollNo = ++autoInc;
        super.setName(name);
        super.setDept(dept);
    }

    public long getRollNo() {
        return this.rollNo;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = " + super.getName() +
                " department = " + super.getDept() +
                " rollNo = " + rollNo +
                " grade = " + grade +
                '}';
    }
}
