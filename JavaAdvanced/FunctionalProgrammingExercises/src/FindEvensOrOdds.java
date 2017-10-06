import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] params = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Predicate<Integer> evenOrOdd = (x) -> x%2 == 0;

        switch (reader.readLine()){
            case "even":

                for (int i = params[0]; i <= params[1]; i++) {
                    if (evenOrOdd.test(i)){
                        System.out.print(i + " ");
                    }
                }
                break;
            case "odd":

                for (int i = params[0]; i <= params[1]; i++) {
                    if (!evenOrOdd.test(i)){
                        System.out.print(i + " ");
                    }
                }
                break;
        }
    }
}
