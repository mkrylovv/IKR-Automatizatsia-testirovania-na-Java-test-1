package library;

import java.util.List;

public interface SearchService {

    LibraryItem findByInventoryNumber(String inventoryNumber);
    List<LibraryItem> findByAuthor(String author);

}
