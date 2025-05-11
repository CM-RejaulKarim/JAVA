package abstractclassemployeemanagement.absclass;

public class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public FullTimeEmployee(double monthlySalary, int employeeId, String empName) {
        super(employeeId, empName);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

}
