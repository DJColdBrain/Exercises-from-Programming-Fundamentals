import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BoundedNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bounds = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .mapToInt(Integer::valueOf)
                .toArray();
        int maxBound = Math.max(bounds[0], bounds[1]);
        int minBound = Math.min(bounds[0], bounds[1]);

        Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::valueOf)
                .filter(x-> minBound<= x && x <= maxBound)
                .forEach(x-> System.out.print(x + " "));
    }
}
