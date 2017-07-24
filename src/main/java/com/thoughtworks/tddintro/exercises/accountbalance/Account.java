package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    public Account() {
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void makeDeposit(int amount) {
        balance += amount;
    }
}
