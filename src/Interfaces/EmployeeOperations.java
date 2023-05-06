package Interfaces;

import All_Classes.*;

public interface EmployeeOperations {
      void insertEmployee(Employee e);

      void removeEmployee(Employee e);

      Employee getEmployee(String empid);

      void showAllEmployee();
}
