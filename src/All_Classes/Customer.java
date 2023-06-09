package All_Classes;

public class Customer {
  private String name;
  private int nid;
  private Account accounts[] = new Account[500];

  public void setName(String name) {
    this.name = name;
  }

  public void setNid(int nid) {
    this.nid = nid;
  }

  public String getName() {
    return name;
  }

  public int getNid() {
    return nid;
  }

  public void insertAccount(Account a) {
    int flag = 0;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] == null) {
        accounts[i] = a;
        flag = 1;
        break;
      }
    }
    if (flag == 1) {
      System.out.println("\nAccount Inserted\n");
    } else {
      System.out.println("\nCan Not Insert\n");
    }
  }

  public void removeAccount(Account a) {
    int flag = 0;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] == a) {
        accounts[i] = null;
        flag = 1;
        break;
      }
    }
    if (flag == 1) {
      System.out.println("\nAccount Removed\n");
    } else {
      System.out.println("\nCan Not Remove\n");
    }
  }

  public void showAllAccounts() {
    for (Account a : accounts) {
      if (a != null) {
        a.showInfo();
      }
    }
  }

  public Account getAccount(int accountNumber) {
    Account a = null;

    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] != null) {
        if (accounts[i].getAccountNumber() == accountNumber) {
          a = accounts[i];
          break;
        }
      }
    }
    if (a != null) {
      System.out.println("\nAccount Found\n");
    } else {
      System.out.println("\nAccount Not Found\n");
    }
    return a;
  }
}