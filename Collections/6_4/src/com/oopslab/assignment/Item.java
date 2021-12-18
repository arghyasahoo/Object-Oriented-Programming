package com.oopslab.assignment;

public class Item {
    private int itemCode;
    private String name;
    private double rate;
    private double quantity;

    public Item(int itemCode, String name, double rate, double quantity) {
        this.itemCode = itemCode;
        this.name = name;
        this.rate = rate;
        this.quantity = quantity;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
