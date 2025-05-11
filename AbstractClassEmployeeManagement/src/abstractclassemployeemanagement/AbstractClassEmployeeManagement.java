package abstractclassemployeemanagement;

import abstractclassemployeemanagement.absclass.Employee;
import abstractclassemployeemanagement.absclass.FullTimeEmployee;
import abstractclassemployeemanagement.absclass.PartTimeEmployee;

public class AbstractClassEmployeeManagement {

    public static void main(String[] args) {
        
        Employee e = new FullTimeEmployee(15500, 1287759, "reja");
        Employee f = new PartTimeEmployee(50, 160, 6011, "raihan");
        
        System.out.println("Full Time Employees Monthly Salary: "+e.calculateSalary());
        System.out.println("part time Employees Total Salary: "+f.calculateSalary());
    }

}
