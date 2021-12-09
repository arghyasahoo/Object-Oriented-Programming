package com.oopslab.assignment;

public abstract class LoanAccount extends Account {
    @Override
    public void deposit(double amount) throws NegativeDeposit {
        if (amount < 0)
            throw new NegativeDeposit("[-] Please provide a positive balance to deposit");
        else
            super.setBalance(super.getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) throws LowBalance, NegativeBalance {
        if (super.getBalance() < amount) {
            throw new NegativeBalance("[-] Insufficient Funds! Current Balance = " + super.getBalance());
        }

        super.setBalance(super.getBalance() - amount);
        if ((super.getBalance()) < 1000) {
            throw new LowBalance("[!] Balance Low! Current Balance = " + super.getBalance());
        }
    }
}
