package library;

import java.util.ArrayList;
import java.util.List;

public class LibrarySearchService implements SearchService, PrintService{

    private LibraryRegistry registry;

    public LibrarySearchService(LibraryRegistry registry) {
        this.registry = registry;
    }

    @Override
    public LibraryItem findByInventoryNumber(String inventoryNumber) {
        for(LibraryItem item : registry.getItems()) {
            if (item.getInventoryNumber().equals(inventoryNumber)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public List<LibraryItem> findByAuthor(String author) {
        List<LibraryItem> result = new ArrayList<>();
        for (LibraryItem item : registry.getItems()) {
            if (item.getAuthor().contains(author)) {
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public void printByInventoryNumber(LibraryItem item) {
        System.out.printf("Found item: Inventory_Number: %s, %s", item.getInventoryNumber(), item.print());
    }

    @Override
    public void printByAuthor(List<LibraryItem> items) {
        for (LibraryItem item : items) {
            System.out.printf("Found item: Inventory_Number: %s, %s", item.getInventoryNumber(), item.print());
        }
    }
}
