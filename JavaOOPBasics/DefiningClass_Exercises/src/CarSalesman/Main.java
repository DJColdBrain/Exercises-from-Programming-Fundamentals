package CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {
    private static LinkedHashMap<String , Engine> engines = new LinkedHashMap<>();
    private static LinkedHashMap<String , Car> cars = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split("\\s+");
            if (data.length == 2){
                Engine engine = new Engine(data[0], data[1]);
                engines.put(data[0], engine);
            }else if (data.length == 3){
                try {
					Integer b  = Integer.valueOf(data[2]);
                    Engine engine = new Engine(data[0], data[1], b);
                    engines.put(data[0], engine);
                }catch (Exception e){
                    Engine engine = new Engine(data[0], data[1], data[2]);
                    engines.put(data[0], engine);
                }
            }else if (data.length == 4){
                Engine engine = new Engine(data[0], data[1], Integer.valueOf(data[2]), data[3]);
                engines.put(data[0], engine);
            }
        }

        n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split("\\s+");
            if (data.length == 2){
                Car car = new Car(data[0], engines.get(data[1]));
                cars.put(data[0], car);
            }else if (data.length == 3){
                try {
					Integer z =  Integer.valueOf(data[2]);
                    Car car = new Car(data[0], engines.get(data[1]), z);
                    cars.put(data[0], car);
                }catch (Exception e){
                    Car car = new Car(data[0], engines.get(data[1]), data[2]);
                    cars.put(data[0], car);
                }
            }else if (data.length == 4){
                Car car = new Car(data[0], engines.get(data[1]), Integer.valueOf(data[2]), data[3]);
                cars.put(data[0], car);
            }
        }

        for (Car car : cars.values()) {
            System.out.println(car);
        }
    }
}
