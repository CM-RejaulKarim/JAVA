package librarymanagementsystem.lclass;

public class Book extends Item {

    private int totalPage;
    private String Edition;

    public Book() {
    }

    public Book(int totalPage, String Edition) {
        this.totalPage = totalPage;
        this.Edition = Edition;
    }

    public Book(int totalPage, String Edition, String title, String author, String yearPublished) {
        super(title, author, yearPublished);
        this.totalPage = totalPage;
        this.Edition = Edition;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Total Pages are: " + totalPage);
        System.out.println(Edition + " Edition.");
    }

}
