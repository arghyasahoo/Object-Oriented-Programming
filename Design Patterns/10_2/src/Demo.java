package com.oopslab.assignment;

public class Demo {
    private Demo() {};
    private static int maxObjects = -1;

    public int a = 2;

    public static Demo createObject() {
        if (maxObjects <= 0) {
            return null;
        }

        maxObjects--;
        return new Demo();
    }

    public static void createMax(int maxObjects) {
        Demo.maxObjects = maxObjects;
    }
}
