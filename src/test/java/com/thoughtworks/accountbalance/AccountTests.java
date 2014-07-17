package com.thoughtworks.accountbalance;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    private final Account account = new Account();

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        //Arrange
        account.setBalance(100);

        //Action
        account.deposit(50);

        //Assert
        assertThat(account.getBalance(), is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        account.setBalance(100);
        account.withdraw(50);
        assertThat(account.getBalance(), is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        account.setBalance(50);
        account.withdraw(100);
        assertThat(account.getBalance(), is(50));
    }
}
