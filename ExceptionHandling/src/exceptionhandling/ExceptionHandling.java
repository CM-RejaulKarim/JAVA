package exceptionhandling;

import java.util.Scanner;
import javax.xml.datatype.DatatypeConfigurationException;

public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            int n1 = 30;
            int n2 = 0;

            double divide = n1 / n2;

            System.out.println("Calculation " + divide);

        } catch (ArithmeticException ex) {

            System.err.println("Numbers are not integer number.");
        }

        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter a integer Number");
            int number = s.nextInt();
            System.out.println(number);

        } catch (Exception e) {
            System.err.println("You didn't input a number.");
        }
    }

}
