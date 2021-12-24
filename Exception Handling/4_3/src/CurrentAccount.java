package com.oopslab.assignment;

public class CurrentAccount extends Account implements Transaction {
    private int minBalance = 1000;
    private final int serviceCharge = 500;
    private boolean isBelowMinBalance = false;

    public CurrentAccount(String name) {
        super.setName(name);
        super.setBalance(0);
        super.setAccountNo((long)(Math.random() * (9999_9999_9999_9999L - 1111_1111_1111_1111L + 1) + 1111_1111_1111_1111L));
        super.setAccType(AccountType.CurrentAccount);
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
    public void withdrawal(double amount) throws LowBalanceException, NegativeBalanceException, NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException();
        } else if (amount > super.getBalance()) {
            throw new NegativeBalanceException();
        } else {
            super.setBalance(super.getBalance() - amount);

            if (super.getBalance() < minBalance) {
                isBelowMinBalance = true;   // impose service charge
                throw new LowBalanceException();
            }
        }
    }
}
