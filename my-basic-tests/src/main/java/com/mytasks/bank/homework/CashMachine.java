package com.mytasks.bank.homework;

public class CashMachine {
    private double[] transaction;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transaction = new double[0];

    }

    public void addTransaction(double amount) {
        if (amount == 0) {
        } else {
            this.size++;
            double[] newTab = new double[this.size];
            System.arraycopy(transaction, 0, newTab, 0, transaction.length);
            newTab[this.size - 1] = amount;
            this.transaction = newTab;
        }
    }

    public double getBalanceOfCashMachine() {
        double sum = 0;
        for (double amount : transaction) {
            sum += amount;
        }
        return sum;
    }

    public int getNumberOfAllTransactions() {
        return transaction.length;
    }

    public double getNumberOfDeposits() {
        int count = 0;
        for (double amount : transaction) {
            if (amount > 0) {
                count++;
            }
        }
        return count;
    }

    public double getNumberOfWithdrawals() {
        int count = 0;
        for (double amount : transaction) {
            if (amount < 0) {
                count++;
            }
        }
        return count;
    }

    public double getAverageDeposits() {
        double sum = 0;
        int count = 0;
        for (double amount : transaction) {
            if (amount > 0) {
                sum += amount;
                count++;
            }
        }
        return sum / count;
    }
    public double getAverageWithdrawals() {
        double sum = 0;
        int count = 0;
        for (double amount : transaction) {
            if (amount < 0) {
                sum += amount;
                count++;
            }
        }
        return sum/count;
    }
}
