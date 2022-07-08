package com.mytasks.bank.homework;
import com.mytasks.bank.homework.CashMachine;

public class Bank {
    private final CashMachine cm1;
    private final CashMachine cm2;
    private final CashMachine cm3;
    private final CashMachine[] allCashMachine;
    private final int size;


    public Bank()  {
        this.cm1 = new CashMachine();
        this.cm2 = new CashMachine();
        this.cm3 = new CashMachine();
        this.allCashMachine = new CashMachine[3];
        this.allCashMachine[0] = cm1;
        this.allCashMachine[1] = cm2;
        this.allCashMachine[2] = cm3;
        this.size = allCashMachine.length;
    }

    public CashMachine getCm1() {
        return cm1;
    }

    public CashMachine getCm2() {
        return cm2;
    }

    public CashMachine getCm3() {
        return cm3;
    }

    public CashMachine[] getAllCashMachine() {
        return allCashMachine;
    }

    public int getSize() {
        return size;
    }
    public double getTotalBalance() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += allCashMachine[i].getBalanceOfCashMachine();
        }
        return sum;
    }
    public double getTotalNumberOfTransactions() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += allCashMachine[i].getNumberOfAllTransactions();
        }
        return sum;
    }
    public double getTotalNumberOfWithdrawals() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += allCashMachine[i].getNumberOfWithdrawals();
        }
        return sum;
    }
    public double getTotalNumberOfDeposits() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += allCashMachine[i].getNumberOfDeposits();
        }
        return sum;
    }
    public double getTotalAverageWithdrawals() {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            sum += allCashMachine[i].getAverageWithdrawals();
            count++;
        }
        return sum / count;
    }
    public double getTotalAverageDeposits() {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            sum += allCashMachine[i].getAverageDeposits();
            count++;
        }
        return sum / count;
    }
}