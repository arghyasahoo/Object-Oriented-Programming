package com.oopslab.assignment;

public class Main {

    public static void main(String[] args) {
        SavingsAccount sAcc = new SavingsAccount("Abc Def");
        CurrentAccount cAcc = new CurrentAccount("Ghi Jkl");

        try {
            sAcc.deposit(2000);
        } catch (NegativeAmountException e) {
            e.printStackTrace();
        }

        System.out.println("Current Balance: " + sAcc.getBalance());

        sAcc.setCompoundInterest(0.04);
        System.out.println("Interest after " + 10 + " years: " + sAcc.computeInterest(10));

        try {
            sAcc.withdrawal(-200);
        } catch (NegativeAmountException | NegativeBalanceException e) {
            e.printStackTrace();
        }

        try {
            sAcc.withdrawal(200);
        } catch (NegativeAmountException | NegativeBalanceException e) {
            e.printStackTrace();
        }

        System.out.println("Current Balance: " + sAcc.getBalance());

        try {
            sAcc.withdrawal(2000);
        } catch (NegativeAmountException | NegativeBalanceException e) {
            e.printStackTrace();
        }

        System.out.println("Current Balance: " + sAcc.getBalance());
    }
}
