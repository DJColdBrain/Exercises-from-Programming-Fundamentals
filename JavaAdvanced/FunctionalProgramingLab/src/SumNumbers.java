import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        Function<String, Integer> count = x -> x.replaceAll("[ ]", "").split(",").length;
        Function<String, Integer> sum = x -> Arrays.stream(x.replaceAll("[ ]", "").split(",")).mapToInt(Integer::parseInt).sum();


        System.out.println("Count = " + count.apply(s));
        System.out.println("Sum = " + sum.apply(s));
    }
}
