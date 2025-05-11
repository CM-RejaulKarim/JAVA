package abstractclassemployeemanagement.absclass;

public class PartTimeEmployee extends Employee {

    private double hourlySalary;
    private int hourWorked;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(double hourlySalary, int hourWorked) {
        this.hourlySalary = hourlySalary;
        this.hourWorked = hourWorked;
    }

    public PartTimeEmployee(double hourlySalary, int hourWorked, int employeeId, String empName) {
        super(employeeId, empName);
        this.hourlySalary = hourlySalary;
        this.hourWorked = hourWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlySalary * hourWorked;

    }

}
