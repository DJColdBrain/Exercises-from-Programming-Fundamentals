package Тelephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split("\\s+");
        String[] urls = reader.readLine().split("\\s+");

        Smartphone smartphone = new Smartphone();

        for (String number : numbers) {
            System.out.println(smartphone.call(number));
        }
        for (String url : urls) {
            System.out.println(smartphone.browse(url));
        }
    }
}
