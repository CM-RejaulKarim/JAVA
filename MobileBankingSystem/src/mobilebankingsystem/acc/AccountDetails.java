package mobilebankingsystem.acc;

public class AccountDetails {

    private String accName;
    private int accNumber;
    private int password;
    private double balance;

    public AccountDetails() {
    }

    public AccountDetails(String accName, int accNumber, int password, double balance) {
        this.accName = accName;
        this.accNumber = accNumber;
        this.password = password;
        this.balance = balance;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountDetails{" + "accName=" + accName + ", accNumber=" + accNumber + ", balance=" + balance + '}';
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " Deposit Successfully.");
        } else {
            System.out.println("Invalid Deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " Withdrawn Successful.");
        } else {
            System.out.println("You don't Have Sufficient Balance.");
        }
    }

    public void accountSummery() {

        System.out.println("Account Holders Name: " + accName);
        System.out.println("Account No: " + accNumber);
        System.out.println("Balance : " + balance);
    }

}
