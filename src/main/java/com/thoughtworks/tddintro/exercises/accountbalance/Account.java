package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    public Account() {
        balance = 0;
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void makeDeposit(int amount) {
        balance += amount;
    }

    public void makeWithdrawal(int amount) {
        if (amount <= balance)  balance -= amount;
    }
}
