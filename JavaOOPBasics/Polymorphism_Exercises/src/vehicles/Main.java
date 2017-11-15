package vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carData = reader.readLine().split("\\s+");
        String[] truckData = reader.readLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(carData[1]),Double.parseDouble(carData[2]));
        Vehicle truck = new Truck(Double.parseDouble(truckData[1]),Double.parseDouble(truckData[2]));

        int n =Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] commands = reader.readLine().split("\\s+");
            try {
                switch (commands[1]){
                    case "Car":

                        if (commands[0].equals("Drive")){
                            car.drive(Double.parseDouble(commands[2]));
                        }else if (commands[0].equals("Refuel")){
                            car.refilFuel(Double.parseDouble(commands[2]));
                        }
                        break;
                    case "Truck":
                        if (commands[0].equals("Drive")){
                            truck.drive(Double.parseDouble(commands[2]));
                        }else if (commands[0].equals("Refuel")){
                            truck.refilFuel(Double.parseDouble(commands[2]));
                        }
                        break;
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        }

        System.out.println(car);
        System.out.println(truck);
    }
}
