package BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Identifiable> identifiables = new ArrayList<>();
        while (true){
            String[] data = reader.readLine().split("\\s+");
            if (data[0].equals("End")){
                break;
            }

            if (data.length ==2){
                identifiables.add(new Robot(data[0], data[1]));
            }else if (data.length == 3){
                identifiables.add(new Citizen(data[0], Integer.parseInt(data[1]), data[2]));
            }
        }
        String id = reader.readLine();

        for (Identifiable identifiable : identifiables) {
            if (identifiable.isFakeId(id)){
                System.out.println(identifiable.getId());
            }
        }

    }
}
