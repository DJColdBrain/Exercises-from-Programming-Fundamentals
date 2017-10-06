import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ListOfPredicates {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] numbers = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        BiPredicate<Integer, Integer> predicate = (a, b) -> a % b == 0;

        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int number1 : numbers) {
                if (!predicate.test(i, number1)) {
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.print(i + " ");
            }
        }
    }
}
