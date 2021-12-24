package com.oopslab.assignment;

import java.time.LocalDateTime;

public class Transaction {
    private final long accountNumber = 1234_5678_9012_3456L;
    private LocalDateTime dateOfTransaction;
    private double amount;
    private String transactionType;
    private Account acc;

    public Transaction(Account acc) {
        this.acc = acc;
    }

    public void withdraw(double amount) throws LowBalanceException, NegativeBalanceException {
        this.amount = amount;

        if ((acc.getBalance() - amount) < 1000 && (acc.getBalance() - amount) >= 0) {
            withdraw();
            throw new LowBalanceException("Low Balance ! Current Balance = " + acc.getBalance());
        } else if ((acc.getBalance() - amount) < 0) {
            throw new NegativeBalanceException("Insufficient Balance Current Balance = " + acc.getBalance());
        } else {
            withdraw();
        }
    }

    public void withdraw() {
        acc.setBalance(acc.getBalance() - amount);
        this.dateOfTransaction = LocalDateTime.now();
        acc.setLastUpdate(LocalDateTime.now());
    }

    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
    }

    public String getTransactionDetails() {
        return "Account Number = " + this.accountNumber +
                "\nLast Transaction = " + this.dateOfTransaction +
                "\nAmount transacted = " + this.amount +
                "\nTransaction Type = " + this.transactionType;
    }
}
