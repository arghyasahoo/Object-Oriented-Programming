package com.oopslab.assignment;

public class NegativeBalanceException extends Exception {
    public NegativeBalanceException() {
        super("[-] Insufficient Funds !");
    }
}
