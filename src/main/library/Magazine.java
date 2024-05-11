package library;

public class Magazine extends LibraryItem{

    private String publisher;
    private int issueNumber;

    public Magazine(String inventoryNumber, String publisher, int issueNumber) {
        super(inventoryNumber);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }

    @Override
    public String getAuthor() {
        return publisher;
    }

    @Override
    public String  print() {
        return "Type: MAGAZINE, Publisher: " + publisher + ", Issue_Number: " + issueNumber + "\n";
    }


}
