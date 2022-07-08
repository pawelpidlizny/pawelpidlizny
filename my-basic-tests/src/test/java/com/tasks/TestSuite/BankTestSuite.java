package com.tasks.TestSuite;
import com.mytasks.bank.homework.Bank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTestSuite {
    @Test
    public void shouldCountTotalBalance() {
        Bank bank1 = new Bank();
        bank1.getCm1().addTransaction(100);
        bank1.getCm1().addTransaction(-1000);
        bank1.getCm1().addTransaction(150);
        bank1.getCm2().addTransaction(0);
        bank1.getCm2().addTransaction(200);
        bank1.getCm2().addTransaction(-500);
        bank1.getCm3().addTransaction(300);
        bank1.getCm3().addTransaction(-100);
        bank1.getCm3().addTransaction(250);

        double totalBalance = bank1.getTotalBalance();
        Assertions.assertEquals(-600, totalBalance, 0.001);
    }
    @Test
    public void shouldCountTotalNumerOfWithdrawals() {
        Bank bank1 = new Bank();
        bank1.getCm1().addTransaction(100);
        bank1.getCm1().addTransaction(-1000);
        bank1.getCm1().addTransaction(150);
        bank1.getCm2().addTransaction(0);
        bank1.getCm2().addTransaction(200);
        bank1.getCm2().addTransaction(-500);
        bank1.getCm3().addTransaction(300);
        bank1.getCm3().addTransaction(-100);
        bank1.getCm3().addTransaction(250);

        double totalNumberOfWithdrawals = bank1.getTotalNumberOfWithdrawals();
        Assertions.assertEquals(3,totalNumberOfWithdrawals,0.001);
    }
    @Test
    public void shouldCountTotalNumberOfDeposits() {
        Bank bank1 = new Bank();
        bank1.getCm1().addTransaction(100);
        bank1.getCm1().addTransaction(-1000);
        bank1.getCm1().addTransaction(150);
        bank1.getCm2().addTransaction(0);
        bank1.getCm2().addTransaction(200);
        bank1.getCm2().addTransaction(-500);
        bank1.getCm3().addTransaction(300);
        bank1.getCm3().addTransaction(-100);
        bank1.getCm3().addTransaction(250);

        double totalNumberOfDeposits = bank1.getTotalNumberOfDeposits();
        Assertions.assertEquals(5,totalNumberOfDeposits,0.001);
    }
    @Test
    public void shouldCountTotalAverageWithdrawal() {
        Bank bank1 = new Bank();
        bank1.getCm1().addTransaction(100);
        bank1.getCm1().addTransaction(-1000);
        bank1.getCm1().addTransaction(150);
        bank1.getCm2().addTransaction(0);
        bank1.getCm2().addTransaction(200);
        bank1.getCm2().addTransaction(-500);
        bank1.getCm3().addTransaction(300);
        bank1.getCm3().addTransaction(-100);
        bank1.getCm3().addTransaction(250);

        double totalAverageWithdrawal = bank1.getTotalAverageWithdrawals();
        Assertions.assertEquals(-533.333,totalAverageWithdrawal,0.001);
    }
    @Test
    public void shouldCountTotalNumberOfNonZeroTransactions() {
        Bank bank1 = new Bank();
        bank1.getCm1().addTransaction(100);
        bank1.getCm1().addTransaction(-1000);
        bank1.getCm1().addTransaction(150);
        bank1.getCm2().addTransaction(0);
        bank1.getCm2().addTransaction(200);
        bank1.getCm2().addTransaction(-500);
        bank1.getCm3().addTransaction(0);
        bank1.getCm3().addTransaction(0);
        bank1.getCm3().addTransaction(250);

        double totalNuberOfTransactions = bank1.getTotalNumberOfTransactions();
        Assertions.assertEquals(6,totalNuberOfTransactions,0.001);
    }
}