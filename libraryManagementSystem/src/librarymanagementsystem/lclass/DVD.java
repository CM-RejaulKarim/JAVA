package librarymanagementsystem.lclass;

public class DVD extends Item {

    private String issueDate;
    private int returnDay;

    public DVD() {
    }

    public DVD(String issueDate, int returnDay) {
        this.issueDate = issueDate;
        this.returnDay = returnDay;
    }

    public DVD(String issueDate, int returnDay, String title, String author, String yearPublished) {
        super(title, author, yearPublished);
        this.issueDate = issueDate;
        this.returnDay = returnDay;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Issue Date: "+issueDate);
        System.out.println("Have to Return in "+returnDay+ "Days");
    }

}
