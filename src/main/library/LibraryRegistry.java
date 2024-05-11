package library;

import java.util.List;

public class LibraryRegistry {

    private List<LibraryItem> items;

    public LibraryRegistry(List<LibraryItem> items) {
        this.items = items;
    }

    public List<LibraryItem> getItems() {
        return items;
    }
}
