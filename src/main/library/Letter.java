package library;

public class Letter extends LibraryItem{

    private String author;

    public Letter(String inventoryNumber, String author) {
        super(inventoryNumber);
        this.author = author;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String print() {
        return "Type: LETTER, Author: " + author + "\n";
    }
}
