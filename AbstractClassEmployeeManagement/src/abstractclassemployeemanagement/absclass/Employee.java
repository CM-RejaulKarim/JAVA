
package abstractclassemployeemanagement.absclass;

public abstract class Employee {
 private int employeeId;
 private String name;

    public Employee() {
    }

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
 
 public abstract double calculateSalary();
}
