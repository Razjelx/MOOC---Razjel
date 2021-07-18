
import java.util.HashMap;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    
        HashMap <String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));
        
        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
        
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book: hashmap.values()) {
            System.out.println(book);
        }
    }
    
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        ArrayList<Book> books = new ArrayList<>();
        
        for(Book book: hashmap.values()) {
            if (!book.getName().contains(text)) {
                continue;
            } else {
                books.add(book);
                System.out.println(book);
            }
        }
    }
}
