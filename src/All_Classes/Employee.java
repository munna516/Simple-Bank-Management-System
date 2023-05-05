package All_Classes;

import java.lang.*;

public class Employee {
    private String emid;
    private String emname;
    private double emsalary;

    public void SetEmployeeId(String id) {
        this.emid = id;
    }

    public void SetEmployeeName(String name) {
        this.emname = name;
    }

    public void SetEmployeeSalary(double salary) {
        this.emsalary = salary;
    }

    public String getEmpid() {
        return emid;
    }

    public String getEmpName() {
        return emname;
    }

    public double getEmpSalary() {
        return emsalary;
    }
}
