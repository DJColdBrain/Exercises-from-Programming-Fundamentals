import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ParkingLot {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String > parking = new HashSet<>();

        while (true){
            String s = reader.readLine();
            if (s.equals("END")){
                break;
            }
            String direction = s.split(", ")[0];
            String carNumber = s.split(", ")[1];

            if (direction.equals("IN")){
                parking.add(carNumber);
            }else if (direction.equals("OUT")){
                parking.remove(carNumber);
            }
        }
        if (parking.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else{
            for (String s : parking) {
                System.out.println(s);
            }
        }

    }
}
