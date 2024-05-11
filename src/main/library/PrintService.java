package library;

import java.util.List;

public interface PrintService {

    void printByInventoryNumber(LibraryItem item);
    void printByAuthor(List<LibraryItem> items);
}
