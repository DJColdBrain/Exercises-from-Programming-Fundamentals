package comparableBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        setTitle(title);
        setYear(year);
        setAuthors(authors);
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public List<String> getAuthors() {
        return Collections.unmodifiableList(this.authors);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthors(String... authors) {
        if (authors.length == 0){
            this.authors = new ArrayList<>();
        }else{
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    @Override
    public int compareTo(Book book) {
        if (book.getTitle().compareTo(this.getTitle()) == 0){
            if (this.getYear() == book.getYear()){
                return 0;
            }else {
                return this.getYear() < book.getYear() ? 1 : -1;
            }
        }else {
            return book.getTitle().compareTo(this.getTitle());
        }
    }

    @Override
    public String toString() {
        return this.getTitle();
    }
}
