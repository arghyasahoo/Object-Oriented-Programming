package com.oopslab.assignment;

public class Commission {
    public int sales;

    public Commission(int sales) {
        this.sales = sales;
    }

    public float getCommission() {
        return (float)sales / 10;
    }
}
