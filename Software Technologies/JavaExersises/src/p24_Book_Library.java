import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by DJColdBrain on 02-Aug-17.
 */
public class p24_Book_Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        Library library = new Library();

        for (int i = 0; i < input; i++) {
            String[] command = scanner.nextLine().split("[\\s]");
            String title = command[0];
            String author = command[1];
            String publisher = command[2];
            String releaseDate = command[3];
            String isbn = command[4];
            double price = Double.parseDouble(command[5]);


            Book book = null;
            if (!library.Books.stream().anyMatch(b -> b.getAuthor().equals(author)))
            {
                book = new Book(title, author, publisher, releaseDate, isbn, price);

                library.Books.add(book);
            }
            else
            {
                for (Book book1 : library.getBooks()) {
                    if (book1.getAuthor().equals( author)){
                        book1.setPrice( price + book1.getPrice());
                    }
                }
            }



        }
        Library library1 = new Library();
        library.Books.stream().sorted(Comparator.comparing(Book::getPrice).thenComparing((a,b)-> b.getAuthor().compareTo(a.getAuthor())).reversed()).forEach(library1.Books::add);
        for (Book book : library1.Books) {
            System.out.printf("%s -> %.2f%n", book.getAuthor(), book.getPrice());
        }
    }
}

class Library1 {
    public String name;
    public ArrayList<Book1> Books;

    public Library1() {
        Books = new ArrayList<Book1>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book1> getBooks() {
        return Books;
    }
}

class Book1 {
    private String Title;
    private String Author;
    private String Publisher;
    private String ReleaseDate;
    private String ISBN;
    private double Price;

    public Book1(String title, String author, String publisher, String releaseDate, String isbn, double price) {
        this.Title = title;
        this.Author = author;
        this.Publisher = publisher;
        this.ReleaseDate = releaseDate;
        this.ISBN = isbn;
        this.Price = price;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
