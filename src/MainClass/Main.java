package MainClass;
import java.util.Scanner;
import All_Classes.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank b = new Bank();
        boolean choice = true;
        System.out.println("\n\n                                   WELCOME TO SIMPLE BANK MANAGEMENT SYSTEM\n");

        while (choice) {
            System.out.println("Here Are Some Option of Our Bank-\n");
            System.out.println("     1. Employee Management");
            System.out.println("     2. Customer Management");
            System.out.println("     3. Customer Account Management");
            System.out.println("     4. Account Transactions");
            System.out.println("     5. Exit\n");
            System.out.print(">>> Enter a Option >>>  : ");
            int first = input.nextInt();
            switch (first) {
                case 1:
                    System.out.println("Here are some option for Employee-\n");
                    System.out.println("     1. Create New Employee");
                    System.out.println("     2. Remove Employee");
                    System.out.println("     3. See All Employee");
                    System.out.println("     4. Go Back\n");
                    System.out.print(">>> Enter a Option >>>  : ");
                    int second1 = input.nextInt();
                    switch (second1) {
                        case 1:
                        System.out.println("You Have Selected to Create New Employee\n");
                            System.out.print("Enter Employee Id       : ");

                            String emid = input.next();

                            System.out.print("Enter Employee Name     : ");
                            String emname = input.next();

                            System.out.print("Enter Employee Salary   : ");
                            double emsalary = input.nextDouble();

                            Employee e = new Employee();
                            e.SetEmployeeId(emid);
                            e.SetEmployeeName(emname);
                            e.SetEmployeeSalary(emsalary);
                            b.insertEmployee(e);

                            break;

                        case 2:
                        System.out.println("You Have Selected to Remove Employee\n");
                            System.out.print("Enter Employee Id       : ");
                            String id1 = input.next();
                            b.removeEmployee(b.getEmployee(id1));

                            break;

                        case 3:
                        System.out.println("You Have Selected to Show All Employee\n");
                            b.showAllEmployees();
                            break;

                        case 4:
                            System.out.println("Going Back...\n");
                            break;

                        default:
                            System.out.println("Invalid Input\n");
                            break;
                    }
                    break;

                case 2:

                    System.out.println("Here are some option for Customer-\n");
                    System.out.println("     1. Create New Customer");
                    System.out.println("     2. Remove Customer");
                    System.out.println("     3. See All Customers");
                    System.out.println("     4. Go Back\n");
                    System.out.print(">>> Enter a Option >>>  : ");
                    int second2 = input.nextInt();
                    switch (second2) {
                        case 1:
                            System.out.println("You Have Selected Create a New Customer\n");
                            System.out.print("Enter Customer NID      : ");
                            int nid1 = input.nextInt();
                            System.out.print("Enter Customer Name     : ");
                            String name1 = input.next();
                            Customer c = new Customer();
                            c.setName(name1);
                            c.setNid(nid1);
                            b.insertCustomer(c);
                            break;

                        case 2:
                            System.out.println("You Have Selected to Remove a Customer\n");
                            System.out.print("Enter Customer NID      : ");
                            int nid2 = input.nextInt();
                            b.removeCustomer(b.getCustomer(nid2));
                            break;

                        case 3:
                            System.out.println("You Have Selected to See All Customer\n");
                            b.showAllCustomers();
                            break;

                        case 4:
                            System.out.println("Going Back...\n");
                            break;

                        default:
                            System.out.println("Invalid Input\n");
                            break;

                    }
                    break;

                case 3:
                    System.out.println("Here are some option Customer Account-\n");
                    System.out.println("  1. Create New Account for a Customer");
                    System.out.println("  2. Remove Account of a Customer");
                    System.out.println("  3. See all Accounts of a Customer");
                    System.out.println("  4. Go Back\n");
                    System.out.print(">>> Enter a Option >>>  : ");
                    int second3 = input.nextInt();
                    switch (second3) {
                        case 1:
                            Account a = null;

                            System.out.println("There are two types of Account\n");
                            System.out.println("     1. Savings Account");
                            System.out.println("     2. Fixed Account");
                            System.out.println("     3. Go Back\n");
                            System.out.print(">>> Enter a Option >>>  : ");
                            int actype = input.nextInt();

                            // Generating Random Account Number
                            int an1 = (int) (Math.random() * (9999 - 999 + 1) + 999);
                            System.out.print("Enter Opening Balance   : ");
                            double ob1 = input.nextDouble();

                            if (actype == 1) {
                                System.out.print("Enter Interest Rate     : ");
                                double ir = input.nextDouble();
                                SavingsAccount sa = new SavingsAccount();
                                sa.setAccountNumber(an1);
                                sa.setBalance(ob1);
                                sa.setInterestRate(ir);
                                a = sa;

                            } else if (actype == 2) {
                                System.out.print("Enter Expired Year      : ");

                                int ex = input.nextInt();
                                FixedAccount fa = new FixedAccount();
                                fa.setAccountNumber(an1);
                                fa.setBalance(ob1);
                                fa.setExpiredYear(ex);
                                a = fa;

                            } else {
                                System.out.println("Invalid Input\n");
                            }
                            if (a != null) {
                                System.out.print("Enter Customer Nid      : ");
                                int nid = input.nextInt();
                                b.getCustomer(nid).insertAccount(a);
                                System.out.println("Your Account Number is  : " + an1);
                            }

                            break;

                        case 2:
                            System.out.println("You Have Selected to Remove Account of a Customer\n");
                            System.out.print("Enter Customer Nid      : ");
                            int nid3 = input.nextInt();
                            System.out.print("Enter Account Number    : ");
                            int an2 = input.nextInt();
                            b.getCustomer(nid3).removeAccount(b.getCustomer(nid3).getAccount(an2));
                            break;

                        case 3:
                            System.out.println("You Have Selected to See All Accounts of Customer\n");
                            System.out.print("Enter Customer Nid      : ");
                            ;
                            int Nid3 = input.nextInt();

                            b.getCustomer(Nid3).showAllAccounts();
                            break;
                        case 4:

                            System.out.println("Going Back...\n");
                            break;

                        default:
                            System.out.println("Invalid Input\n");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("You have selected Account Transactions\n");
                    System.out.println("Here are Some Options- \n");
                    System.out.println("     1. Deposit Money");
                    System.out.println("     2. Withdraw Money");
                    System.out.println("     3. Transfer Money");
                    System.out.println("     4. Go Back\n");
                    System.out.print(">>> Enter a Option >>>  : ");
                    int second4 = input.nextInt();
                    switch (second4) {
                        case 1:
                            System.out.print("Enter Customer Nid      : ");
                            int nid4 = input.nextInt();
                            System.out.print("Enter Account Number    : ");
                            int an2 = input.nextInt();
                            System.out.print("Enter Deposit Amount    : ");
                            double amount1 = input.nextDouble();
                            b.getCustomer(nid4).getAccount(an2).deposit(amount1);
                            break;

                        case 2:
                            System.out.print("Enter Customer Nid      : ");
                            int nid5 = input.nextInt();
                            System.out.print("Enter Account Number    : ");
                            int an3 = input.nextInt();
                            System.out.print("Enter Withdraw Amount   : ");
                            double amount2 = input.nextDouble();
                            b.getCustomer(nid5).getAccount(an3).withdraw(amount2);
                            break;

                        case 3:
                            System.out.print("Enter Sending Customer Nid     : ");
                            int NIDS = input.nextInt();
                            System.out.print("Enter Sending Account Number   : ");
                            int ANS = input.nextInt();
                            System.out.print("Enter Transfer Amount          : ");
                            double amount3 = input.nextDouble();
                            System.out.print("Enter Receiving Customer Nid   : ");
                            int NIDR = input.nextInt();
                            System.out.print("Enter Receiving Account Number : ");
                            int ANR = input.nextInt();
                            b.getCustomer(NIDS).getAccount(ANS).transfer(b.getCustomer(NIDR).getAccount(ANR), amount3);
                            break;

                        case 4:
                            System.out.println("Going Back...\n");
                            break;
                        default:
                            System.out.println("Invalid Input\n");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("\nYou Have Selected to Exit the Application");
                    System.out.println("Thank You for Using Our Simple Bank......\n");
                    choice = false;
                    break;
                default:
                    System.out.println("Invalid Input\n");
                    break;
            }

        }
       input.close();
    }
}