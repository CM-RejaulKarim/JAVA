package mobilebankingsystem;

import java.util.Scanner;
import mobilebankingsystem.acc.AccountDetails;

public class MobileBankingSystem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        AccountDetails details = new AccountDetails();

        System.out.println("Enter Your Account Name:...");
        String inputAccName = s.next();
        details.setAccName(inputAccName);

        System.out.println("Enter Your Account Number:...");
        int inputAccNumber = s.nextInt();
        details.setAccNumber(inputAccNumber);

        System.out.println("Set a Password:...");
        int inputPassword = s.nextInt();
        details.setPassword(inputPassword);

        System.out.println("Welcome!! Your Account Activated Successfully.");
        System.out.println(details);

        System.out.println("\n");
        System.out.println("Do You Want to Deposit press-1");
        System.out.println("Do You Want to Withdraw press-2");
        System.out.println("Do You Want Close press-0)");

        for (int index = 1; index <= 5; index++) {

            int userChoice1 = s.nextInt();
            if (userChoice1 == 1) {

                System.out.println("Enter Deposite Amount:----");
                double depositAmount = s.nextDouble();
                details.deposit(depositAmount);
                System.out.println(details);

            } else if (userChoice1 == 2) {

                System.out.println("Enter Withdraw Amount:----");
                double withdrawAmount = s.nextDouble();
                details.withdraw(withdrawAmount);
                System.out.println(details);
            } 
            else {
                s.close();
            }
        }

    }

}
