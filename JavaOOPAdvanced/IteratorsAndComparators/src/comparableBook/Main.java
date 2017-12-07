package comparableBook;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookTwo = new Book("The Documents in the Case", 2002);
        Book bookThree = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
        Library library = new Library(bookOne, bookTwo, bookThree);

        if (bookThree.compareTo(bookTwo) > 0) {
            System.out.println(String.format("%s is before %s", bookThree, bookTwo));
        } else if (bookThree.compareTo(bookTwo) < 0) {
            System.out.println(String.format("%s is before %s", bookTwo, bookThree));
        } else {
            System.out.println("Book are equal");
        }


    }
}
