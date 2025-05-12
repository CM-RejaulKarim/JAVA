package oopbankingsystem.acc;

public class RegularAccountHolder extends AccountHolder {

    private double transectionAmount;

    public RegularAccountHolder(double transectionAmount) {
        this.transectionAmount = transectionAmount;
    }

    public RegularAccountHolder(double transectionAmount, String name, int accountNumber) {
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
        return transectionAmount * 0.0185;
    }

}
