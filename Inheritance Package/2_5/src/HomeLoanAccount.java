package com.oopslab.assignment;

public final class HomeLoanAccount extends LoanAccount {
    private final int minBalance = 2000;

    public HomeLoanAccount(String name, String address, long PAN, boolean addressProof) {
        super.create(name, address, PAN, addressProof);
        try {
            deposit(minBalance);
        } catch (NegativeDeposit e) {
            e.printStackTrace();
        }
    }
}
