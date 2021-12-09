package com.oopslab.assignment;

public class AccountNumberAlreadyExists extends Exception {
    public AccountNumberAlreadyExists() {
        super("[-] Account Number already exists");
    }
}
