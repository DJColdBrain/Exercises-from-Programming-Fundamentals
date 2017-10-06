import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s =reader.readLine();
        Consumer<String> clients = x -> System.out.println(x);

        for (String s1 : s.split("\\s+")) {
            clients.accept(s1);
        }
    }
}
