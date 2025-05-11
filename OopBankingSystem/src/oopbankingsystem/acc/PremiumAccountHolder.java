package oopbankingsystem.acc;

public class PremiumAccountHolder extends AccountHolder {

    private double transectionAmount;

    public PremiumAccountHolder(double transectionAmount) {
        this.transectionAmount = transectionAmount;
    }

    public PremiumAccountHolder(double transectionAmount, String name, int accountNumber) {
        super(name, accountNumber);
        this.transectionAmount = transectionAmount;
    }

    public double getTransectionAmount() {
        return transectionAmount;
    }

    public void setTransectionAmount(double transectionAmount) {
        this.transectionAmount = transectionAmount;
    }

    @Override
    public double transectionFee() {
        return transectionAmount * 0.01499; 
    }

    
    
}
