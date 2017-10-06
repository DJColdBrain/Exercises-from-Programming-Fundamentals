import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class FindTheSmallestElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        String s = reader.readLine();
        for (String s1 : s.split("\\s+")) {
            list.add(Integer.parseInt(s1));
        }

        Function<List<Integer>, Integer> findMinIndex = x-> x.lastIndexOf(Collections.min(x));

        System.out.println(findMinIndex.apply(list));
    }
}
