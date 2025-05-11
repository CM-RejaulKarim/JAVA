package infinityloop;

import java.util.Arrays;
import java.util.Scanner;

public class InfinityLoop {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] myArray = {};

        for (int i = 0; i <= myArray.length; i++) {

            System.out.println("enter number");
            int k = s.nextInt();
            myArray[i] = k;

            System.out.println(Arrays.toString(myArray));
        }

    }

}
