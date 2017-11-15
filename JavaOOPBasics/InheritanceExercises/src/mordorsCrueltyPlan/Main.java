package mordorsCrueltyPlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Gandalf gandalf = new Gandalf(reader.readLine().split("\\s+"));
        System.out.println(gandalf);
    }
}
