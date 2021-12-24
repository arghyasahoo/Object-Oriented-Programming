package com.oopslab.assignment;

public class LowBalanceException extends Exception {
    public LowBalanceException() {
        super("[-] Current balance less than minimum balance");
    }
}
