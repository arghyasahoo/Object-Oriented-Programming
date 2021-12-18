package com.oopslab.assignment;

public class Manager extends Employee {
    private double bonus;

    public Manager() {}

    public Manager(int id, String name, Department department, int salary) {
        super(id, name, department, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void display() {
        System.out.println("Name: " + super.getName() +
                            "\nDepartment: " + super.getDepartment() +
                            "\nId: " + super.getId() +
                            "\nSalary: " + (super.getSalary() + this.getBonus()));
    }
}
