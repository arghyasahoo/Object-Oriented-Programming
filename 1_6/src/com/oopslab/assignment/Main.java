package com.oopslab.assignment;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        School school = new School();

        // Initialize Students
        Student s1 = new Student("Arghya Sahoo", Course.CSE, new HashMap<Subject, Integer>() {{
            put(Subject.PHYSICS, 78);
            put(Subject.MATH, 86);
            put(Subject.CHEMISTRY, 80);
            put(Subject.ENGLISH, 85);
            put(Subject.BIOLOGY, 90);
        }});

        Student s2 = new Student("Soutik Das", Course.AEIE, new HashMap<Subject, Integer>() {{
            put(Subject.PHYSICS, 78);
            put(Subject.MATH, 86);
            put(Subject.CHEMISTRY, 80);
            put(Subject.ENGLISH, 85);
            put(Subject.BIOLOGY, 90);
        }});

        Student s3 = new Student("Aditya Sashi", Course.ECE, new HashMap<Subject, Integer>() {{
            put(Subject.PHYSICS, 78);
            put(Subject.MATH, 86);
            put(Subject.CHEMISTRY, 80);
            put(Subject.ENGLISH, 85);
            put(Subject.BIOLOGY, 90);
        }});

        Student s4 = new Student("Nirban Adhikary", Course.EE, new HashMap<Subject, Integer>() {{
            put(Subject.PHYSICS, 78);
            put(Subject.MATH, 86);
            put(Subject.CHEMISTRY, 80);
            put(Subject.ENGLISH, 85);
            put(Subject.BIOLOGY, 90);
        }});

        Student s5 = new Student("Sayak Bose", Course.IT, new HashMap<Subject, Integer>() {{
            put(Subject.PHYSICS, 78);
            put(Subject.MATH, 86);
            put(Subject.CHEMISTRY, 80);
            put(Subject.ENGLISH, 85);
            put(Subject.BIOLOGY, 90);
        }});

        Student s6 = new Student("Sayan Purkait", Course.CE, new HashMap<Subject, Integer>() {{
            put(Subject.PHYSICS, 78);
            put(Subject.MATH, 86);
            put(Subject.CHEMISTRY, 80);
            put(Subject.ENGLISH, 85);
            put(Subject.BIOLOGY, 90);
        }});

        Student s7 = new Student("Md. Ashraf", Course.ME, new HashMap<Subject, Integer>() {{
            put(Subject.PHYSICS, 78);
            put(Subject.MATH, 86);
            put(Subject.CHEMISTRY, 80);
            put(Subject.ENGLISH, 85);
            put(Subject.BIOLOGY, 90);
        }});


        // Add students to School
        school.add(s1);
        school.add(s2);
        school.add(s3);
        school.add(s4);
        school.add(s5);
        school.add(s6);
        school.add(s7);


        // Modify Students Information
        school.modify(s2, Course.IT);

        // Delete Student Information
        school.remove(s7);
    }
}
