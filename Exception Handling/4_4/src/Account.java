package com.oopslab.assignment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Account {
    private final long accountNumber = 1234_5678_9012_3456L;
    private double balance = 0.0;
    private LocalDateTime lastUpdate = LocalDateTime.now();

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public String getLastUpdate() {
        DateTimeFormatter fmtObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return lastUpdate.format(fmtObj);
    }
    
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountDetails() {
        return "Account Number = " + this.getAccountNumber() +
                "\nCurrent Balance = " + this.getBalance() +
                "\nLast Updated = " + this.getLastUpdate();
    }

}
