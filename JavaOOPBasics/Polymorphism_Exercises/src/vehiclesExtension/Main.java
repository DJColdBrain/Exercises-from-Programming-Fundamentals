package vehiclesExtension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, Vehicle> vehicles = new LinkedHashMap<>();
        try {
            for (int i = 0; i < 3; i++) {
                String[] data = reader.readLine().split("\\s+");
                if (data[0].equals("Car")){
                    Vehicle car = new Car(Double.parseDouble(data[1]),Double.parseDouble(data[2]),Double.parseDouble(data[3]));
                    vehicles.put(data[0], car);
                }else if (data[0].equals("Truck")){
                    Vehicle truck = new Truck(Double.parseDouble(data[1]),Double.parseDouble(data[2]),Double.parseDouble(data[3]));
                    vehicles.put(data[0], truck);
                }else{
                    Vehicle bus = new Bus(Double.parseDouble(data[1]),Double.parseDouble(data[2]),Double.parseDouble(data[3]));
                    vehicles.put(data[0], bus);
                }
            }

            int n =Integer.parseInt(reader.readLine());

            for (int i = 0; i < n; i++) {
                String[] commands = reader.readLine().split("\\s+");
                try {
                    Vehicle vehicle = vehicles.get(commands[1]);
                    switch (commands[0]){
                        case "Drive":
                            vehicle.drive(Double.parseDouble(commands[2]));
                            break;
                        case "Refuel":
                            vehicle.refilFuel(Double.parseDouble(commands[2]));
                            break;
                        case "DriveEmpty":
                            vehicle.setEmpty(commands[0]);
                            vehicle.drive(Double.parseDouble(commands[2]));
                            break;
                    }

                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }

            }

            for (Vehicle vehicle : vehicles.values()) {
                System.out.println(vehicle);
            }

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
