package com.thoughtworks.accountbalance;

/**
 * Created by KBrown on 7/17/14. TDD Intro
 */
public class Account {
    private int balance;

    public Account(int b) {
        balance = b;
    }
    public void setBalance(int b) {
        balance = b;
    }

    public void deposit(int s) {
        balance += s;
    }

    public void withdraw(int s) {
        if(balance >= s)
            balance -= s;
    }

    public int getBalance() {
        return balance;
    }
}
