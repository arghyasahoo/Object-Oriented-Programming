package com.oopslab.assignment;

public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Asd Fgh", Department.CSE);
        Teacher t2 = new Teacher("Asd Fgh", Department.IT);
        Teacher t3 = new Teacher("Asd Fgh", Department.ME);

        Student s1 = new Student("Hgj Lok", Department.CSE);
        Student s2 = new Student("Pkl Hyd", Department.IT);
        Student s3 = new Student("Rdk Uml", Department.ECE);
        Student s4 = new Student("Odf Gbh", Department.EE);
        Student s5 = new Student("Tck Jez", Department.ME);

        // Set grades of students
        s1.setGrade(9.3);
        s2.setGrade(8.2);
        s3.setGrade(8.7);
        s4.setGrade(7.5);
        s5.setGrade(7.7);

        // Set salaries of teachers
        t1.setSalary(50_000);
        t2.setSalary(48_000);
        t3.setSalary(45_000);


        // Show teacher info
        System.out.println("Teacher Info");
        System.out.println("------------");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        // Show student info
        System.out.println("\nStudent Info");
        System.out.println("------------");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
