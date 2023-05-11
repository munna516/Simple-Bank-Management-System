package Interfaces;
import All_Classes.*;

public interface Transaction {
    public abstract void withdraw(double amount);
	void deposit(double amount);
	void transfer(Account a, double amount);
}
