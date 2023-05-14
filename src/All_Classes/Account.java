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

    public void deposit(double amount) {
        if (amount > 0) {
            System.out.println("Previous Balance: " + balance);
            System.out.println("Deposit Amount: " + amount);
            balance += amount;
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("\nCan Not Deposit\n");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            System.out.println("Previous Balance:  " + balance);
            System.out.println("Withdraw Amount:  " + amount);
            balance -= amount;
            System.out.println("Current Balance:  " + balance);
        } else {
            System.out.println("\nInsufficient Balance\n");
        }
    }

    public void transfer(Account a, double amount) {
        if (amount > 0 && amount <= balance) {
            System.out.println("Previous Balance:  " + this.balance);
            System.out.println("Transfer Amount:  " + amount);
            this.balance = this.balance - amount;
            a.balance = a.balance + amount;
            System.out.println("Current Balance:  " + this.balance);
        } else {
            System.out.println("\nInsufficient Balance & Can Not Transfer\n");
        }
    }
}