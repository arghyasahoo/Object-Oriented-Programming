package com.oopslab.assignment;

public interface Transaction {
    public void deposit(double amount) throws NegativeAmountException;
    public void withdrawal(double amount) throws LowBalanceException, NegativeBalanceException, NegativeAmountException;
}
