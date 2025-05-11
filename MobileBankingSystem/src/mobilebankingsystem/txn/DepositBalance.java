package mobilebankingsystem.txn;

import mobilebankingsystem.acc.AccountDetails;

public class DepositBalance extends AccountDetails {
    private double depositeBalance;

    public DepositBalance(double depositeBalance) {
        this.depositeBalance = depositeBalance;
    }

    public DepositBalance(double depositeBalance, String accName, int accNumber, int password, double balance) {
        super(accName, accNumber, password, balance);
        this.depositeBalance = depositeBalance;
    }

    public double getDepositeBalance() {
        return depositeBalance;
    }

    public void setDepositeBalance(double depositeBalance) {
        this.depositeBalance = depositeBalance;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }
    
    
    

}
