package librarymanagementsystem.lclass;

import java.util.Date;

public class Item {

   private String title;
   private String author;
   private Date yearPublished;

    public Item() {
    }

    public Item(String title, String author, Date yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    
    public void printDetails(){
    
        System.out.println(title);
        System.out.println(author);
        System.out.println(yearPublished);
    
    }
    
    
}
