package oopbankingsystem;

import oopbankingsystem.acc.PremiumAccountHolder;
import oopbankingsystem.acc.RegularAccountHolder;

public class OopBankingSystem {

    public static void main(String[] args) {

        RegularAccountHolder regularAcc = new RegularAccountHolder(20000, "rejaul", 2760);
        PremiumAccountHolder premiumAcc = new PremiumAccountHolder(20000, "Sadiar", 77785);
        
        
        System.out.println("Regular Account Transection fee: "+regularAcc.transectionFee()+ " For BDT"+regularAcc.getTransectionAmount());
        System.out.println("Premium Account Transection fee: "+premiumAcc.transectionFee()+ " For BDT"+premiumAcc.getTransectionAmount());
    }

}
