package mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            for (int i = 0; i < 2; i++) {
                String[] tokkens = reader.readLine().split("\\s+");
                Student student = new Student(tokkens[0], tokkens[1], tokkens[2]);
                tokkens = reader.readLine().split("\\s+");
                Worker worker = new Worker(tokkens[0], tokkens[1], Double.parseDouble(tokkens[2]), Double.parseDouble(tokkens[3]));

                System.out.println(student);
                System.out.println(worker);
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
