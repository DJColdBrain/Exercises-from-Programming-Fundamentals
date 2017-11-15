package BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Birthable> birthables = new ArrayList<>();
        while (true){
            String[] data = reader.readLine().split("\\s+");
            if (data[0].equals("End")){
                break;
            }

            if (data[0].equals("Pet")){
                birthables.add(new Pet(data[1], data[2]));
            }else if (data[0].equals("Citizen")){
                birthables.add(new Citizen(data[1], Integer.parseInt(data[2]), data[3], data[4]));
            }
        }
        String id = reader.readLine();

        for (Birthable birthable : birthables) {
            if (birthable.isBirthdayYear(id)){
                System.out.println(birthable.getBirthdate());
            }
        }

    }
}
