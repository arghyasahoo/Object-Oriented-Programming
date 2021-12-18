package com.oopslab.assignment;

public class Main {

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("Arghya Sahoo", "Newtown, Kolkata, WB", 1234_5678, true);

        System.out.println("Savings A/C details");
        System.out.println("-------------------");
        System.out.println("A/C ID: " + s.getCustomerId());
        System.out.println("A/C holder name: " + s.getName());
        System.out.println("Savings A/C no.: " + s.getAccountNumber());
        System.out.println("A/C holder address: " + s.getAddress());
        System.out.println("A/C holder PAN No.: " + s.getPAN());

        long accNo = s.getAccountNumber();

        s.update(accNo, "Some Random Name", "", 1540);
        System.out.println("A/C Holder name after change: " + s.getName());
    }
}
