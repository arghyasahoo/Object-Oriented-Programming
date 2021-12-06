package com.oopslab.assignment;

import java.util.HashMap;

public class Student {
    public static int autoInc = 0;
    public final int roll;
    public String name;
    public Course course;
    HashMap<Subject, Integer> marks;

    public Student(String name, Course course, HashMap<Subject, Integer> marks) {
        this.name = name;
        this.course = course;
        this.marks = marks;
        this.roll = ++autoInc;
    }
}
