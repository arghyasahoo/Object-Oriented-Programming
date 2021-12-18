package com.oopslab.assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class School {
    ArrayList<Student> students = new ArrayList<>();

    public void add(Student student) {
        students.add(student);
    }

    public void modify(Student student, String name) {
        // everything could be modified other than roll no.
        student.name = name;
    }

    public void modify(Student student, HashMap<Subject, Integer> marks) {
        // everything could be modified other than roll no.
        student.marks = marks;
    }

    public void modify(Student student, Course course) {
        // everything could be modified other than roll no.
        student.course = course;
    }

    public void remove(Student student) {
        students.remove(student);
    }

    public float calculateAverage(Student student) {
        float avg = 0;
        for (Subject subject : student.marks.keySet()) {
            avg += student.marks.get(subject);
        }

        avg /= Subject.values().length;

        return avg;
    }

    public float calculateAverage(Subject subject) {
        float avg = 0;
        for (Student student : students) {
            avg += student.marks.get(subject);
        }

        avg /= Subject.values().length;

        return avg;
    }

}
