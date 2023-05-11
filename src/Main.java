import java.util.Scanner;
import java.lang.*;
import Interfaces.*;
import All_Classes.*;

public class Main {
    // My commit
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank b = new Bank();
        boolean choice = true;
        System.out.println("\n\nWELCOME TO SIMPLE BANK MANAGEMENT SYSTEM\n");

        while (choice) {
            System.out.println("Here Are Some Option-\n");
            System.out.println("     1. Employee Management");
            System.out.println("     2. Customer Management");
            System.out.println("     3. Customer Account Management");
            System.out.println("     4. Account Transactions");
            System.out.println("     5. Exit\n");
            System.out.print(">>> Enter a Option : ");
            int first = input.nextInt();
            switch (first) {
                case 1:
                    System.out.println("You Have Selected Employee Management.\n");
                    System.out.println("Here are some option-\n");
                    System.out.println("     1. Create New Employee");
                    System.out.println("     2. Remove Employee");
                    System.out.println("     3. See All Employee");
                    System.out.println("     4. Go Back\n");
                    System.out.print(">>> Enter a Option : ");
                    int second1 = input.nextInt();
                    switch (second1) {
                        case 1:
                            System.out.println("You Have Selected Create a New Employee\n");
                            System.out.print("Enter Employee Id : ");
                            String emid = input.nextLine();

                            String ch1 = input.nextLine();

                            System.out.print("Enter Employee Name : ");
                            String emname = input.nextLine();

                            System.out.print("Enter Employee Salary : ");
                            double emsalary = input.nextDouble();

                            String ch2 = input.nextLine();

                            Employee emp = new Employee();
                            emp.SetEmployeeId(emid);
                            emp.SetEmployeeName(emname);
                            emp.SetEmployeeSalary(emsalary);
                            b.insertEmployee(emp);

                            break;

                        case 2:
                            System.out.println("You Have Selected to Remove an Employee\n");
                            System.out.print("Enter Employee Id : ");
                            String id1 = input.nextLine();

                            break;

                        case 3:
                            System.out.println("You Have Selected to See All Employee\n");
                            break;

                        case 4:
                            System.out.println("Going Back...");
                            break;

                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("You Have Selected Customer Management\n");
                    System.out.println("Here are some option-\n");
                    System.out.println("     1. Create New Customer");
                    System.out.println("     2. Remove Customer");
                    System.out.println("     3. See All Customers");
                    System.out.println("     4. Go Back\n");
                    System.out.print(">>> Enter a Option : ");
                    int second2 = input.nextInt();
                    switch (second2) {
                        case 1:
                            System.out.println("You Have Selected Create a New Customer\n");
                            System.out.print("Enter Customer NID : ");
                            int nid1 = input.nextInt();

                            String ch3 = input.nextLine();

                            System.out.print("Enter Customer Name : ");
                            String name1 = input.nextLine();
                            break;
                        case 2:
                            System.out.println("You Have Selected to Remove a Customer\n");
                            System.out.print("Enter Customer NID : ");
                            int nid2 = input.nextInt();
                            break;
                        case 3:
                            System.out.println("You Have Selected to See All Customer\n");
                            break;
                        case 4:
                            System.out.println("Going Back...");
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;

                    }
                    break;

                case 3:
                    System.out.println("You Have Selected Customer Account Management\n");
                    System.out.println("Here are some option-\n");
                    System.out.println("	1. Create New Account for a Customer");
                    System.out.println("	2. Remove Account of a Customer");
                    System.out.println("	3. See all Accounts of a Customer");
                    System.out.println("	4. Go Back\n");
                    System.out.print(">>> Enter a Option : ");
                    int second3 = input.nextInt();
                    switch (second3) {
                        case 1:
                            // Account a = NULL;

                            System.out.println("There are two types of Account\n");
                            System.out.println("     1. Savings Account");
                            System.out.println("     2. Fixed Account");
                            System.out.println("     3. Go Back\n");
                            System.out.print(">>> Enter a Option : ");
                            int actype = input.nextInt();
                            // Generating Random Account Number
                            int an1 = (int) (Math.random() * (9999 - 999 + 1) + 999);
                            System.out.print("Enter Opening Balance: ");
                            double ob1 = input.nextDouble();

                            if (actype == 1) {
                                System.out.print("Enter Interest Rate: ");
                                double ir = input.nextDouble();
                            } else if (actype == 2) {
                                System.out.print("Enter Expired Year: ");
                                int ex = input.nextInt();

                            }

                            break;

                        case 2:
                            System.out.println("You Have Selected to Remove Account of a Customer\n");
                            System.out.print("Enter Customer Nid: ");
                            int nid2 = input.nextInt();
                            System.out.print("Enter Account Number: ");
                            int an2 = input.nextInt();
                            break;

                        case 3:
                            System.out.println("You Have Selected to See All Accounts of Customer\n");
                            break;
                        case 4:

                            System.out.println("Going Back...");
                            break;

                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("You have selected Account Transactions\n");
                    System.out.println("Here are Some Options- \n");
                    System.out.println("     1. Deposit Money");
                    System.out.println("     2. Withdraw Money");
                    System.out.println("     3. Transfer Money");
                    System.out.println("     4. Show Transaction History");
                    System.out.println("     5. Go Back\n");
                    System.out.print(">>> Enter a Option : ");
                    int second4 = input.nextInt();
                    switch (second4) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            break;
                    }
                case 5:
                    System.out.println("\nYou Have Selected to Exit the Application");
                    System.out.println("Thank You for Using Our Simple Bank......\n");
                    choice = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }

        }

    }
}
