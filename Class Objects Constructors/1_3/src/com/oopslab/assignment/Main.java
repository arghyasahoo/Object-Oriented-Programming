package com.oopslab.assignment;

public class Main {

    public static void main(String[] args) {
	    Account acc = new Account();
        Transaction t = new Transaction(acc);

        System.out.println("\n==============================================\n");
        t.deposit(50_000);

        System.out.println(acc.getAccountDetails());

        try {
            t.withdraw(12_000);
        } catch (LowBalanceException e) {
            e.printStackTrace();
        } catch (NegativeBalanceException e) {
            e.printStackTrace();
        }

        System.out.println(t.getTransactionDetails());
        System.out.println("\n==============================================\n");

        System.out.println(acc.getAccountDetails());
        try {
            t.withdraw(37_500);
        } catch (LowBalanceException e) {
            e.printStackTrace();
        } catch (NegativeBalanceException e) {
            e.printStackTrace();
        }

        System.out.println(t.getTransactionDetails());

        System.out.println("\n==============================================\n");

        System.out.println(acc.getAccountDetails());
        try {
            t.withdraw(70_000);
        } catch (LowBalanceException e) {
            e.printStackTrace();
        } catch (NegativeBalanceException e) {
            e.printStackTrace();
        }

        t.getTransactionDetails();

        System.out.println("\n==============================================\n");
    }
}
