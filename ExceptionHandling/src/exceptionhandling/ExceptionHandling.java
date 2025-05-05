package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;

public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            int n1 = 30;
            int n2 = 0;

            double divide = n1 / n2;

            System.out.println("Calculation " + divide);

        } catch (ArithmeticException ex) {

            System.err.println(ex + "\n");
        }

        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter a integer Number");
            int number = s.nextInt();
            System.out.println(number);

        } catch (Exception e) {
            System.err.println(e);
        }

        try {
            PrintWriter f = new PrintWriter("C:\\Users\\Admin\\Desktop\\FileClass\\New folder");

        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        }
    }

}
