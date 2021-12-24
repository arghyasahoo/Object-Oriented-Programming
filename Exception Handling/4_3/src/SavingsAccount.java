package com.oopslab.assignment;

public class SavingsAccount extends Account implements Transaction {
    private double compoundInterest = 0.04;

    public SavingsAccount(String name) {
        super.setName(name);
        super.setBalance(0);
        super.setAccountNo((long)(Math.random() * (9999_9999_9999_9999L - 1111_1111_1111_1111L + 1) + 1111_1111_1111_1111L));
        super.setAccType(AccountType.SavingsAccount);
    }

    @Override
    public void deposit(double amount) throws NegativeAmountException {
        if (amount <= 0) {
            throw new NegativeAmountException();
        } else {
            super.setBalance(super.getBalance() + amount);
        }
    }

    @Override
    public void withdrawal(double amount) throws NegativeBalanceException, NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException();
        } else if (amount > super.getBalance()) {
            throw new NegativeBalanceException();
        } else {
            super.setBalance(super.getBalance() - amount);
        }
    }

    public double computeInterest(int timePeriod) {
        return (getBalance() + getBalance() * compoundInterest * timePeriod);
    }

    public void setCompoundInterest(double compoundInterest) {
        this.compoundInterest = compoundInterest;
    }
}
