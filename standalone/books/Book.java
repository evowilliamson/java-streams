package books;

import java.util.Arrays;
import java.util.List;

class Book {

    List<String> words;

    public Book(String words) {
        this.words = Arrays.asList(words.split(" "));
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

}