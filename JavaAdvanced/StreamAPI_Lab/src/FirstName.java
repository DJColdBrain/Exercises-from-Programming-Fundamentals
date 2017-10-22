import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Stream<String> names =Arrays.stream(reader.readLine().split("\\s+"));
        List<String> letters = Arrays.stream(reader.readLine().split("\\s+"))
                .map(x->x.toUpperCase())
                .collect(Collectors.toList());

        List<String> list =  names.filter(x -> letters.contains(String.valueOf(x.charAt(0))))
                .sorted()
                .limit(1)
                .collect(Collectors.toList());

        if (list.size() == 0){
            System.out.println("No match");
        }else{
            list.stream().forEach(y -> System.out.print(y));
        }



    }
}
