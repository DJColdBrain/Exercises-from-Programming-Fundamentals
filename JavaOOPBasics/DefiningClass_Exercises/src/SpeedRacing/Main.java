package SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {

    private static LinkedHashMap<String, Car> cars = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split("\\s+");
            String model = data[0];
            double fuel =Double.parseDouble(data[1]);
            double fuelPerKm = Double.parseDouble(data[2]);
            Car car = new Car(model, fuel, fuelPerKm);
            cars.put(model, car);
        }

        while (true){
            String[] data = reader.readLine().split("\\s+");
            String command = data[0];
            if (command.equals("End")){
                break;
            }
            if (command.equals("Drive")){
                int km = Integer.parseInt(data[2]);
                String model = data[1];
                cars.get(model).drive(km);
            }
        }

        for (Car car : cars.values()) {
            System.out.println(car);
        }

    }
}
