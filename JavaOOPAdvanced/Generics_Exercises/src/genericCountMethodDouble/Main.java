package genericCountMethodDouble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        BoxCounting<Double> boxCounting = new BoxCounting<>();

        for (int i = 0; i < n; i++) {
            boxCounting.add(Double.parseDouble(reader.readLine()));
        }
        System.out.println(boxCounting.compareListTo(Double.parseDouble(reader.readLine())));
    }
}
