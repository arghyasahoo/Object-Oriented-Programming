package com.oopslab.assignment;

public class AccountNotFound extends Exception {
    public AccountNotFound() {
        super("[-] Account Does not Exist");
    }
}
