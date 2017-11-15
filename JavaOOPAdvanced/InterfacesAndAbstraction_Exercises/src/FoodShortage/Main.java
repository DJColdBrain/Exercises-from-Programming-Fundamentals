package FoodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Buyer> buyers = new LinkedHashMap<>();
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split("\\s+");
            if (data.length == 3){
                buyers.put(data[0], new Rebel(data[0],Integer.parseInt(data[1]), data[2]));
            }else if (data.length == 4){
                buyers.put(data[0], new Citizen(data[0], Integer.parseInt(data[1]), data[2], data[3]));
            }
        }

        while (true){
            String[] data = reader.readLine().split("\\s+");
            if (data[0].equals("End")){
                break;
            }
            if (buyers.containsKey(data[0])){
                buyers.get(data[0]).buyFood();
            }


        }
        int points = 0;
        for (Buyer buyer : buyers.values()) {
            points += buyer.getFoodPurchased();
        }
        System.out.println(points);
    }
}
