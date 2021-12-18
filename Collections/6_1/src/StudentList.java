package com.oopslab.assignment;

import java.util.LinkedList;

public class StudentList {
    private LinkedList<Student> stdList = new LinkedList<>();

    public void add(Student std) {
        stdList.add(std);
    }

    public LinkedList<Student> getList() {
        return this.stdList;
    }
}
