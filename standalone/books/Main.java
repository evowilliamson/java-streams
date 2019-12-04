package books;

import java.util.Arrays;
import java.util.List;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        List<Book> library = Arrays.asList(
            new Book("this books contains a few words"), 
            new Book("another book with words"),
            new Book("the last book with a few words"));

        library.stream().flatMap(book -> book.getWords().stream()).distinct().forEach(System.out::println);

    }
}