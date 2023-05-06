package All_Classes;

import java.lang.*;

import Interfaces.CustomerOperations;
import Interfaces.EmployeeOperations;

public  class  Bank implements CustomerOperations,EmployeeOperations {
    private Employee employees[] = new Employee[50];
    private Customer customers[]= new Customer[500];

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
}
