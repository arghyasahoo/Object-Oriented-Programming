package com.oopslab.assignment;

import java.util.*;

public class AccountHolders {
    private HashMap<Long, Account> accounts = new HashMap<>();

    public Account get(long accNo) throws AccountNotFound {
        if (accounts.containsKey(accNo))
            return accounts.get(accNo);
        else
            throw new AccountNotFound();
    }

    public Set<Long> getAccountNumbers() {
        return accounts.keySet();
    }

    public void add(long accNo, Account ac) {
        accounts.put(accNo, ac);
    }
}
