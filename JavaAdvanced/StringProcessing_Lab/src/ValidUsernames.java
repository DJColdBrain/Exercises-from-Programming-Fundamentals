import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder("");

        Pattern pattern = Pattern.compile("^[A-Za-z0-9-_]{3,16}$");

        String input;
        while (!(input = reader.readLine()).equals("END")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.matches())
                output.append("valid");
            else
                output.append("invalid");

            output.append(System.lineSeparator());
        }

        System.out.println(output);
    }
}