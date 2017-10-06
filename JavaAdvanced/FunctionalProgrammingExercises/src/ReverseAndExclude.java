import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAndExclude {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();


        int divider = Integer.parseInt(reader.readLine());

        int[] result = Arrays.stream(numbers).filter(a ->  Math.abs(a % divider) > 0).toArray();
        for (int i = result.length-1; i >= 0 ; i--) {
            System.out.print(result[i]+" ");
        }


    }
}
