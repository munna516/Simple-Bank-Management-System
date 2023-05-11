package All_Classes;

import Interfaces.Transaction;

public abstract class Account implements Transaction {
    protected int accountNumber;
    protected double balance;

    public void setAccountNumber(int acNum) {
        this.accountNumber = acNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public abstract void showInfo();
    
}
