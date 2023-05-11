package All_Classes;

import java.lang.*;

public class Bank {
    private Employee employees[] = new Employee[50];
    private Customer customers[] = new Customer[500];

    public void insertEmployee(Employee e) {
        int flag = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = e;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Employee Inserted");
        } else {
            System.out.println("Can Not Insert");
        }
    }

    public void removeEmployee(Employee e) {
        int flag = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == e) {
                employees[i] = null;
                flag = 1;
                break;
            }
        }
    }

    public Employee getEmployee(String empId) {
        Employee e = null;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getEmpid().equals(empId)) {
                    e = employees[i];
                    break;
                }
            }
        }
        if (e != null) {
            System.out.println("Employee Found & Removed");
        } else {
            System.out.println("Employee Not Found & Can Not Remove");
        }
        return e;
    }

    public void showAllEmployees() {
        System.out.println("************************************");
        for (Employee e : employees) {
            if (e != null) {
                System.out.println("Employee Name: " + e.getEmpName());
                System.out.println("Employee ID: " + e.getEmpid());
                System.out.println("Salary: " + e.getEmpSalary());
                System.out.println();
            }
        }

        System.out.println("************************************");
    }
    public void insertCustomer(Customer c) {
        int flag = 0;
        for (int i = 0; i < customers.length; i++) {
          if (customers[i] == null) {
            customers[i] = c;
            flag = 1;
            break;
          }
        }
        if (flag == 1) {
          System.out.println("Customer Inserted");
        } else {
          System.out.println("Can Not Insert");
        }
      }
    
      public void removeCustomer(Customer c) {
        int flag = 0;
        for (int i = 0; i < customers.length; i++) {
          if (customers[i] == c) {
            customers[i] = null;
            flag = 1;
            break;
          }
        }
      }
    
      public void showAllCustomers() {
        System.out.println("**********************************");
        for (Customer c : customers) {
          if (c != null) {
            
            System.out.println("Customer Name: " + c.getName());
            System.out.println("Customer NID: " + c.getNid());
            System.out.println("\n");  
          }
        }
        System.out.println("**********************************");
      }
    
      public Customer getCustomer(int nid) {
        Customer c = null;
    
        for (int i = 0; i < customers.length; i++) {
          if (customers[i] != null) {
            if (customers[i].getNid() == nid) {
              c = customers[i];
              break;
            }
          }
        }
        if (c != null) {
          System.out.println("Customer Found & Removed");
        } else {
          System.out.println("Customer Not Found & Cannot Remove");
        }
        return c;
      }
    }
    