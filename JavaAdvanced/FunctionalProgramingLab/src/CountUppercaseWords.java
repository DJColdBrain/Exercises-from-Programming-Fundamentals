import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        Predicate<String> upperCase = x-> Character.isUpperCase(x.charAt(0));
        List<String > stringList = new ArrayList<>();
        for (String s1 : s.split(" ")) {
            if (s1.length()>0 && upperCase.test(s1)){
                stringList  .add(s1);
            }
        }
        System.out.println(stringList.size());
        for (String s1 : stringList) {
            System.out.println(s1);
        }
    }
}
