package bookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {



    @Override
    public int compare(Book first, Book second) {
        if (first.getTitle().compareTo(second.getTitle()) == 0){
            if (first.getYear() == second.getYear()){
                return 0;
            }else{
                return first.getYear() < second.getYear() ? -1 : 1;
            }
        }else{
            return first.getTitle().compareTo(second.getTitle());
        }
    }
}
