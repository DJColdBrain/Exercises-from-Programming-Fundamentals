import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int lenght = Integer.parseInt(reader.readLine());
        String names = reader.readLine();

        Predicate<String > nameLenghtIsGood = x->x.length() <=lenght;

        for (String s : names.split("\\s+")) {
            if (nameLenghtIsGood.test(s)){
                System.out.println(s);
            }
        }


    }
}
