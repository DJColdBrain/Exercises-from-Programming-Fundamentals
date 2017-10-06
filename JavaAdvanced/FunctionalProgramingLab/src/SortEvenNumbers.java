import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> integerList = new ArrayList<Integer>();
        for (int number : numbers) {
            integerList.add(number);
        }

        integerList.removeIf(x -> x % 2 != 0 );
        System.out.println(Arrays.asList(integerList).toString().replaceAll("[\\[\\]]", ""));
        integerList.sort((x,y) -> x.compareTo(y));

        System.out.println(Arrays.asList(integerList).toString().replaceAll("[\\[\\]]", ""));
    }
}
