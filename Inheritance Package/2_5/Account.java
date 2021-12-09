package com.oopslab.assignment;

public abstract class Account {
    AccountHolders accountHolders = new AccountHolders();

    private String name;
    private String address;
    private long PAN;
    private boolean addressProof;

    private static int autoIncr = 0;
    private long accountNumber;
    private int customerId;

    private double balance;

    // Create a new account
    public void create(String name, String address, long PAN, boolean addressProof) {
        this.name = name;
        this.address = address;
        this.PAN = PAN;
        this.addressProof = addressProof;

        this.customerId = ++autoIncr;
        long leftLimit = 1000_000_000_000L;
        long rightLimit = 9999_9999_9999_9999L;
        this.accountNumber = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));

        // Make sure the account number is unique. Generate account numbers until it is unique
        while (accountHolders.getAccountNumbers().contains(this.accountNumber)) {
            this.accountNumber = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
        }

        accountHolders.add(accountNumber, this);
    }


    // Account can be updated through customer id or account number
    public void update(long accountNumber, String name, String address, int PAN) {
        try {
            update(accountHolders.get(accountNumber), name, address, PAN);
        } catch (AccountNotFound e) {
            e.printStackTrace();
        }
    }
    
    public void update(Account ac, String name, String address, int PAN) {
        if (!name.equals(""))
            ac.name = name;
        else if (!address.equals(""))
            ac.address = address;
        else if (PAN == 0)
            ac.PAN = PAN;
    }
    

    // abstract methods to be implemented in subclasses
    public abstract void deposit(double amount) throws NegativeDeposit;
    public abstract void withdraw(double amount) throws LowBalance, NegativeBalance;


    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPAN() {
        return PAN;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public int getCustomerId() {
        return customerId;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
