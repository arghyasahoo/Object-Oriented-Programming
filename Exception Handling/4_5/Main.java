package com.oopslab.assignment;

public class Main {

    public static void main(String[] args) {
	    Student s = new Student("Arghya Sahoo", 20);

        // Setting a valid score
        try {
            s.setScore(70);
            // Show student information
            System.out.println("Name: " + s.getName());
            System.out.println("Roll: " + s.getRoll());
            System.out.println("Score: " + s.getScore());
        } catch (InvalidScoreException e) {
            e.printStackTrace();
        }

        // Setting an invalid score ( < 0 )
        try {
            s.setScore(-10);
            // Show student information
            System.out.println("Name: " + s.getName());
            System.out.println("Roll: " + s.getRoll());
            System.out.println("Score: " + s.getScore());
        } catch (InvalidScoreException e) {
            e.printStackTrace();
        }

        // Setting a invalid score ( > 100 )
        try {
            s.setScore(120);
            // Show student information
            System.out.println("Name: " + s.getName());
            System.out.println("Roll: " + s.getRoll());
            System.out.println("Score: " + s.getScore());
        } catch (InvalidScoreException e) {
            e.printStackTrace();
        }
    }
}
