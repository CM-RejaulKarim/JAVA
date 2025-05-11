package librarymanagementsystem.lclass;


public class Item {

    private String title;
    private String author;
    private String yearPublished;

    public Item() {
    }

    public Item(String title, String author, String yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void printDetails() {

        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Published Year: "+yearPublished);

    }

}
