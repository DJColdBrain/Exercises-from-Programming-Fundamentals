package RawData;

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
            String[] details = reader.readLine().split("\\s+");
            Car car = new Car(details);
            cars.put(details[0], car);
        }

        String type = reader.readLine();

        if (type.equals("flamable")){
            cars.entrySet().stream().filter(e -> e.getValue().getEngine().getPower() > 250 && e.getValue().getCargo().getType().equals(type)).forEach(b -> System.out.println(b.getValue()));
        }else if (type.equals("fragile")){
            cars.entrySet().stream().filter(e -> e.getValue().getTires().entrySet().stream().anyMatch(b ->b.getValue().getPresure() < 1.0)  && e.getValue().getCargo().getType().equals(type)).forEach(b -> System.out.println(b.getValue()));
        }


    }
}
