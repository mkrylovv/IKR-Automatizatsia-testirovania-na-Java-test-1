package library;

public abstract class LibraryItem {

    private String inventoryNumber;

    public LibraryItem(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public abstract String getAuthor();

    public abstract String print();

}
