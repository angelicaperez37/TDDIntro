package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account();
        account.makeDeposit(10);
        assertTrue(account.getBalance()==10);
    }

    @Test
    @Ignore
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

    }

    @Test
    @Ignore
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
