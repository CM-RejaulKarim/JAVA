package evenoddusingfileclass;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EvenOddUsingFileClass {

    public static void main(String[] args) {

        try {
            PrintWriter pw = new PrintWriter("C:\\Users\\user\\Desktop"+ "\\Java Store\\EvenNumber.txt"); // 
            PrintWriter px = new PrintWriter("C:\\Users\\user\\Desktop"+ "\\Java Store\\OddNumber.txt"); //
                    pw.println("Even Numbers From 1 to 50 Given bellow: ");
                    px.println("Odd Numbers From 1 to 50 Given bellow: ");
            for (int i = 1; i <= 50; i++) {
                if (i % 2 == 0) {
                    pw.println(" "+i);
                }
                else{
                px.println(" "+i);
                }
            }
            pw.close();
            px.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EvenOddUsingFileClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
