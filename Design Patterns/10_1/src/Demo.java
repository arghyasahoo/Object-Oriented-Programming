package com.oopslab.assignment;

public class Demo {
    private Demo() {};
    private static boolean objCreated = false;

    public int a = 2;

    public static Demo createObject() {
        if (objCreated) {
            return null;
        } else {
            objCreated = true;
            return new Demo();
        }
    }
}
