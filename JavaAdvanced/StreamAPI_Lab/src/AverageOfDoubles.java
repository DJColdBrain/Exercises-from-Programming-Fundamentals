import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AverageOfDoubles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] doubles = Arrays.stream(reader.readLine().split("\\s+"))
                .filter( s-> !s.isEmpty())
                .mapToDouble(Double::parseDouble)
                .toArray();

        if (doubles.length!= 0){
           System.out.printf("%.2f",Arrays.stream(doubles).average().getAsDouble());
        }else{
            System.out.println("No match");
        }
    }
}
