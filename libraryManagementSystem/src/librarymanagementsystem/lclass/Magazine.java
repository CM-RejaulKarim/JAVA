package librarymanagementsystem.lclass;


public class Magazine extends Item {

    private String magazineType;
    private int pubblishedInYear;

    public Magazine() {
    }

    public Magazine(String magazineType, int pubblishedInYear) {
        this.magazineType = magazineType;
        this.pubblishedInYear = pubblishedInYear;
    }

    public Magazine(String magazineType, int pubblishedInYear, String title, String author, String yearPublished) {
        super(title, author, yearPublished);
        this.magazineType = magazineType;
        this.pubblishedInYear = pubblishedInYear;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("The Type Of this Magazine: "+magazineType);
        System.out.println("The Magazine is Published  "+pubblishedInYear+" in a Year");
    }

}
