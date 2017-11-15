package SpeedRacing;

public class Car {
    private String model;
    private int distanceTravel;
    private double fuel;
    private double fuelPerKilometer;

    public Car(String name, double fuel, double fuelPerKilometer){
        this.model =name;
        this.fuel = fuel;
        this.fuelPerKilometer = fuelPerKilometer;
        this.distanceTravel = 0;
    }

    public void drive(int kilometers){
        if (fuel - (fuelPerKilometer* kilometers) < 0){
            System.out.println("Insufficient fuel for the drive");
        }else{
            this.distanceTravel += kilometers;
            this.fuel -= kilometers*fuelPerKilometer;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", model , fuel, distanceTravel);
    }
}
