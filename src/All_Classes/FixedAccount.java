package All_Classes;

import java.lang.*;

public class FixedAccount extends Account {
    private int expiredyear;

	public void setExpiredYear(int expiredyear) {
		this.expiredyear = expiredyear;
	}

	public int getExpiredYear() {
		return expiredyear;
	}

	public void showInfo() {
		System.out.println("Account Number: " + getAccountNumber());
		System.out.println("Balance: " + getBalance());
		System.out.println("Tenure Year: " + expiredyear);
		System.out.println();
	}
}
