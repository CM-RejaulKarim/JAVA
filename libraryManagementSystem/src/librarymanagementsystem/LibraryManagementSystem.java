package librarymanagementsystem;

import librarymanagementsystem.lclass.Book;
import librarymanagementsystem.lclass.DVD;
import librarymanagementsystem.lclass.Magazine;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        
        Book b = new Book(1300, "10th", "CoreJava", "D.L", "2000");
        Magazine m = new Magazine("Institutional Magazine",4 , "Glory of IDB", "Mosahidul Islam", "2025");
        DVD dvd= new DVD("11-May-25", 7, "CoreJavaAudioBook", "D.L", "2005");
        
        b.printDetails();
        System.out.println("============");
        m.printDetails();
        System.out.println("============");
        dvd.printDetails();
        
    }

}
