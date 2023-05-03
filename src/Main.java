import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean choice = true;
        System.out.println("\n\nWELCOME TO SIMPLE BANK MANAGEMENT SYSTEM");

        while (choice) {
            System.out.println("Here Are Some Option-\n");
            System.out.println("     1. Employee Management");
            System.out.println("     2. Customer Management");
            System.out.println("     3. Customer Account Management");
            System.out.println("     4. Account Transactions");
            System.out.println("     5. Exit\n");
            System.out.print("What do you want to do? : ");
            int first = input.nextInt();
            switch (first) {
                case 1:
                    System.out.println("You Have Selected Employee Management.");
                    System.out.println("Here are some option-\n");
                    System.out.println("     1. Create New Employee");
                    System.out.println("     2. Remove Employee");
                    System.out.println("     3. See All Employee");
                    System.out.println("     4. Go Back\n");
                    System.out.print("What do you want to do? : ");
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
                            // Employee emp = new Employee();
                        case 2:
                            System.out.println("You Have Selected to Remove an Employee\n");
                            System.out.print("Enter Employee Id : ");
                            String id1 = input.nextLine();

                            break;
                        case 3:
                            System.out.println("You Have Selected to See All Employee");
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
                    System.out.println("You Have Selected Customer Management");
                    System.out.println("Here are some option-\n");
                    System.out.println("     1. Create New Customer");
                    System.out.println("     2. Remove Customer");
                    System.out.println("     3. See All Customers");
                    System.out.println("     3. Go Back\n");
                    System.out.print("What do you want to do? : ");
                    int second2 = input.nextInt();
                    switch (second2) {
                        case 1:
                            System.out.println("You Have Selected Create a New Customer\n");
                            System.out.print("Enter Customer NID : ");
                            int nid = input.nextInt();
                            String ch1 = input.nextLine();
                            System.out.print("Enter Customer Name : ");
                            String emname = input.nextLine();
                        case 2:
                            System.out.println("You Have Selected to Remove a Customer\n");
                            System.out.print("Enter Customer NID : ");
                            int nid1 = input.nextInt();
                            break;
                        case 3:
                            System.out.println("You Have Selected to See All Customer");
                            break;
                        case 4:
                            break;
                        default:
                            break;

                    }
                    break;

                case 3:
                    System.out.println("You Have Selected Customer Account Management");
                    System.out.println("Here are some option-\n");
                    System.out.println("	1. Create New Account for a Customer");
                    System.out.println("	2. Remove Account of a Customer");
                    System.out.println("	3. See all Accounts of a Customer");
                    System.out.println("	4. Go Back\n");
                    System.out.print("What do you want to do? : ");
                    int second3 = input.nextInt();
                    switch (second3) {
                        case 1:
                            System.out.println("There are two types of Account");
                            System.out.println("     1. Savings Account");
                            System.out.println("     2. Fixed Account");
                            System.out.println("     3. Go Back\n");
                            System.out.print("What do you want to do? : ");
                            int actype = input.nextInt();
                            break;
                        case 2:
                            break;
                        case 3:
                            System.out.println("You Have Selected to See All Accounts of Customer");
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
                    System.out.println("You have selected Account Transactions");
                    System.out.println("Here are Some Options- \n");
                    System.out.println("     1. Deposit Money");
                    System.out.println("     2. Withdraw Money");
                    System.out.println("     3. Transfer Money");
                    System.out.println("     4. Show Transaction History");
                    System.out.println("     5. Go Back\n");
                    System.out.print("What do you want to do? : ");
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
                    System.out.println("Thank You for Using Our Simple Bank......");
                    choice = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }

        }

    }
}
