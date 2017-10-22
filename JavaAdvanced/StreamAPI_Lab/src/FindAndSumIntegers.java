import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindAndSumIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).filter(s-> s.matches("[-\\d]+")).mapToInt(Integer::parseInt).toArray();

        if (arr.length != 0){
            System.out.println(Arrays.stream(arr).sum());
        }else{
            System.out.println("No match");
        }
    }
}
