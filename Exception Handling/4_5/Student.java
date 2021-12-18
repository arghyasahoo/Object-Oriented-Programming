package com.oopslab.assignment;

public class Student {
    private String name;
    private int roll;
    private int score;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) throws InvalidScoreException {
        if (score < 0)
            throw new InvalidScoreException("[-] Score cannot be negative");
        else if (score > 100)
            throw new InvalidScoreException("[-] Score cannot exceed 100");
        else
            this.score = score;
    }
}
