package com.oopslab.assignment;

import java.util.ArrayList;

public class StudentArray {
    private ArrayList<Student> stdArr = new ArrayList<>();

    public void add(Student std) {
        stdArr.add(std);
    }

    public ArrayList<Student> getArr() {
        return this.stdArr;
    }
}
