package com.oopslab.assignment;

public class Main {

    public static void main(String[] args) {
	    Account acc = new Account();
        Transaction t = new Transaction();

        acc.setBalance(50_000);

        System.out.println(acc.getAccountDetails());
        System.out.println(t.withdraw(12_000));
        System.out.println(t.getTransactionDetails());
        System.out.println(acc.getAccountDetails());

        System.out.println(acc.getAccountDetails());
        System.out.println(t.withdraw(70_000));
        System.out.println(t.getTransactionDetails());
        System.out.println(acc.getAccountDetails());
    }
}
