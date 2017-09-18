
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class p20_Count_Working_Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
        LocalDate firstDate = LocalDate.parse(scanner.nextLine(), format);
        LocalDate secondDate = LocalDate.parse(scanner.nextLine(), format);

        LocalDate[] hollidays = {LocalDate.of(2016,1,1 ),
                LocalDate.of(2016,3,3 ),
                LocalDate.of(2016,5,1 ),
                LocalDate.of(2016,5,6 ),
                LocalDate.of(2016,9,6 ),
                LocalDate.of(2016,5,24 ),
                LocalDate.of(2016,9,22 ),
                LocalDate.of(2016,11,1 ),
                LocalDate.of(2016,12,24 ),
                LocalDate.of(2016,12,25 ),
                LocalDate.of(2016,12,26 )};
        int count = 0;
        LocalDate c = secondDate.plusDays(1);
        for (LocalDate i = firstDate; !i.equals(c); i = i.plusDays(1)){

            if (i.getDayOfWeek() == DayOfWeek.SUNDAY || i.getDayOfWeek()==DayOfWeek.SATURDAY){
                continue;
            }
            boolean t = false;
            for (LocalDate holliday : hollidays) {
                if (holliday.getMonthValue() == i.getMonthValue() && holliday.getDayOfMonth() == i.getDayOfMonth()){
                    t = true;
                    break;
                }
            }
            if (!t){
            count++;
            }
        }
        System.out.println(count);
    }
}
