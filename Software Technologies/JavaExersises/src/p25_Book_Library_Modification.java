import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class p25_Book_Library_Modification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library lib = new Library();
        lib.Books = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Book book = new Book();
            String[] commands = scanner.nextLine().split("[\\s]");
            book.setTitle( commands[0]);
            book.setRelDate(LocalDate.parse(commands[3], DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ENGLISH)));

            lib.Books.add(book);
        }
        ArrayList<Book> books = lib.Books;

        HashMap<String, LocalDate> dict =new HashMap<>();
        String inn = scanner.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(inn, format);

        for (Book book : books) {
            String tit = book.getTitle();
            LocalDate relD = book.getRelDate();

                dict.put(tit, relD);

        }
        HashMap<String, LocalDate> dict2;
        dict2 = dict.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,
                Map.Entry::getValue,
                (a, b) -> a, //or throw an exception
                LinkedHashMap::new));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        Map<String, Integer> name;

        for (Map.Entry<String, LocalDate> entry : dict2.entrySet()) {
            String formattedString = entry.getValue().format(formatter);

            if (entry.getValue().compareTo(date) > 1){
                System.out.printf("%s -> "+ formattedString + "%n", entry.getKey());
            }
        }
    }

}


class Library {
    public String name;
    public ArrayList<Book> Books;

    public Library() {
        Books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBooks() {
        return Books;
    }
}

class Book {
    private String Title;
    private String Author;
    private String Publisher;
    private LocalDate relDate;
    private String ReleaseDate;
    private String ISBN;
    private double Price;

    public Book() {
    }

    public Book(String title, String author, String publisher, String releaseDate, String isbn, double price) {
        this.Title = title;
        this.Author = author;
        this.Publisher = publisher;
        this.ReleaseDate = releaseDate;
        this.ISBN = isbn;
        this.Price = price;
    }

    public LocalDate getRelDate() {
        return relDate;
    }

    public void setRelDate(LocalDate relDate) {
        this.relDate = relDate;
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

