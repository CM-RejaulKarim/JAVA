
package factorialusingbiginteger;

import java.math.BigInteger;
import java.util.Scanner;


public class FactorialUsingBigInteger {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int inp = s.nextInt();
        
//        BigInteger count = new BigInteger(inp);
        BigInteger fact1 = BigInteger.ONE;
        BigInteger fact2 = BigInteger.valueOf(10);
        BigInteger fact3 =new BigInteger("10");
        
        for (int i = 1; i <= inp ; i++) {
            fact1 = fact1.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact1);
        System.out.println(fact2);
        System.out.println(fact3);
    }
    
}
