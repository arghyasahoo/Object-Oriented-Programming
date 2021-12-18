package com.oopslab.assignment;

import java.util.Vector;

public class StudentVector {
    private Vector<Student> stdVec = new Vector<>();

    public void add(Student s) {
        stdVec.add(s);
    }

    public Vector<Student> getVec() {
        return stdVec;
    }
}
