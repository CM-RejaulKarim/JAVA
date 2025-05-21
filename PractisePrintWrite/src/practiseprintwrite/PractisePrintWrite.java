package practiseprintwrite;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PractisePrintWrite {

    public static void main(String[] args) {

        try {
            PrintWriter pw = new PrintWriter("C:\\Users\\user\\Desktop\\Java Store\\FileClass\\WDPF.txt");
            
            pw.println("Hello World!");
            pw.println("Hello Java!");
            pw.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PractisePrintWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
