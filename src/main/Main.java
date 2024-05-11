import library.*;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("001", "J.K.Rowling", "Harry Potter and the Philosopher's Stone"));
        items.add(new Book("002", "J.K.Rowling", "Harry Potter and the Chamber of Secrets"));
        items.add(new Magazine("003", "Bloomsbury", 12));
        items.add(new Magazine("004", "Bloomsbury", 45));
        items.add(new Letter("005", "А.С.Пушкин"));
        items.add(new Letter("006", "Пушкин Александр Сергеевич"));

        LibraryRegistry registry = new LibraryRegistry(items);
        LibrarySearchService librarySearchService = new LibrarySearchService(registry);

        List<LibraryItem> itemsByAuthor = librarySearchService.findByAuthor("J.K.Rowling");
        librarySearchService.printByAuthor(itemsByAuthor);

        LibraryItem item1 = librarySearchService.findByInventoryNumber("003");
        librarySearchService.printByInventoryNumber(item1);

        List<LibraryItem> itemsByAuthor2 = librarySearchService.findByAuthor("Пушк");
        librarySearchService.printByAuthor(itemsByAuthor2);

    }
}
