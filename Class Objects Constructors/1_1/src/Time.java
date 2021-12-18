package com.oopslab.assignment;

public class Time {
    private int hour;
    private int minute;
    private int second;


    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void display() {
        int hour = this.hour;
        String time = "AM";

        if (this.hour > 12) {
            hour = this.hour - 12;
            time = "PM";
        }
        System.out.println(hour + ":" + minute + ":" + second + " " + time);
    }
}
