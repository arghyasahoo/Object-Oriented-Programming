package com.oopslab.assignment;

public class Main {

    public static void main(String[] args) {
	    Student s1 = new Student("Abc", 15, Department.IT);
	    Student s2 = new Student("Def", 20, Department.ME);
	    Student s3 = new Student("Ghi", 17, Department.CSE);
	    Student s4 = new Student("Jkl", 22, Department.CSE);
	    Student s5 = new Student("Bno", 56, Department.CE);
	    Student s6 = new Student("Pqr", 42, Department.ECE);
	    Student s7 = new Student("Stw", 3, Department.EE);

        StudentArray stdA = new StudentArray();
        stdA.add(s1);
        stdA.add(s2);
        stdA.add(s3);
        stdA.add(s4);
        stdA.add(s5);
        stdA.add(s6);
        stdA.add(s7);

        StudentList stdL = new StudentList();
        stdL.add(s1);
        stdL.add(s2);
        stdL.add(s3);
        stdL.add(s4);
        stdL.add(s5);
        stdL.add(s6);
        stdL.add(s7);

        StudentVector stdV = new StudentVector();
        stdV.add(s1);
        stdV.add(s2);
        stdV.add(s3);
        stdV.add(s4);
        stdV.add(s5);
        stdV.add(s6);
        stdV.add(s7);


        // ArrayList sorted by name
        stdA.getArr().sort((sOne, sTwo) -> sOne.name.compareTo(sTwo.name));
        System.out.println("Sorted By Name");
        System.out.println(stdA.getArr());
        // ArrayList sorted by roll number
        stdA.getArr().sort((sOne, sTwo) -> sOne.getRoll().compareTo(sTwo.getRoll()));
        System.out.println("Sorted By Roll No.");
        System.out.println(stdA.getArr());

        System.out.println("----------------------------");

        // LinkedList sorted by name
        stdL.getList().sort((sOne, sTwo) -> sOne.name.compareTo(sTwo.name));
        System.out.println("Sorted By Name");
        System.out.println(stdL.getList());
        // LinkedList sorted by roll number
        stdL.getList().sort((sOne, sTwo) -> sOne.getRoll().compareTo(sTwo.getRoll()));
        System.out.println("Sorted By Roll No.");
        System.out.println(stdL.getList());

        System.out.println("----------------------------");

        // Vector sorted by name
        stdV.getVec().sort((sOne, sTwo) -> sOne.name.compareTo(sTwo.name));
        System.out.println("Sorted By Name");
        System.out.println(stdV.getVec());
        // Vector sorted by roll number
        stdV.getVec().sort((sOne, sTwo) -> sOne.getRoll().compareTo(sTwo.getRoll()));
        System.out.println("Sorted By Roll No.");
        System.out.println(stdV.getVec());

    }
}
