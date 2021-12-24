package com.oopslab.assignment;

public class NegativeAmountException extends Exception {
    public NegativeAmountException() {
        super("[-] Cannot Deposit/Withdraw Zero or Negative Balance");
    }
}
