package bookComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookTwo = new Book("The Documents in the Case", 2002);
        Book bookThree = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
        Library library = new Library(bookOne, bookTwo, bookThree);

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
        books.sort(new BookComparator());
        books = books.stream().sorted(Book::compareTo).collect(Collectors.toList());
        for (Book book : books) {
            System.out.println(book.getTitle() + " : "+ book.getYear());
        }
    }
}
