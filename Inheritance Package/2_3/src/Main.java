package com.oopslab.assignment;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int totalManagers=5, highestSalary = 0;
        Manager managerWithHighestSalary = new Manager();
        ArrayList<Manager> managers = new ArrayList<>();

        managers.add(new Manager(1, "Abc Def", Department.DEVELOPER, 60_000));
        managers.add(new Manager(2, "Ghi Jkl", Department.DEVELOPER, 50_000));
        managers.add(new Manager(3, "Mno Pqr", Department.DEVELOPER, 70_000));
        managers.add(new Manager(4, "Stu Vwx", Department.DEVELOPER, 65_000));
        managers.add(new Manager(5, "Yza Bcd", Department.DEVELOPER, 72_000));

        // Set managers' bonus (between 1000 & 8000)
        for (Manager m : managers) {
            m.setBonus(Math.random()*(8000-1000+1)+1000);
        }

        // Get the manager with the highest salary
        for (Manager m : managers) {
            highestSalary = Math.max(m.getSalary(), highestSalary);
            managerWithHighestSalary = m;
        }

        // Print manager's info with the highest salary
        managerWithHighestSalary.display();
    }
}
