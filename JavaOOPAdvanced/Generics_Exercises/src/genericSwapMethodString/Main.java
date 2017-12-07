package genericSwapMethodString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Container<String> container = new Container<>();

        for (int i = 0; i < n; i++) {
            container.add(reader.readLine());
        }
        int[] pos = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        container.swap(pos[0], pos[1]);

        System.out.println(container);
    }
}
