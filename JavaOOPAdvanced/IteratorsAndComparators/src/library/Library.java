package library;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;

public class Library implements Iterable<Book> {

    private Book[] books;
    private List<Book> kkk;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private final class LibIterator implements Iterator<Book>{

        private int counter;

        public LibIterator() {
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return this.counter < books.length;
        }

        @Override
        public Book next() {
            return books[counter++];
        }
    }
}
