
package oopbankingsystem.acc;

public class AccountHolder {
    private String name;
    private int accountNumber;

    public AccountHolder() {
    }

    public AccountHolder(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "AccountHolder{" + "name=" + name + ", accountNumber=" + accountNumber + '}';
    }
    
    public double transectionFee(){
    
    return 0.0;
    }
    
}
