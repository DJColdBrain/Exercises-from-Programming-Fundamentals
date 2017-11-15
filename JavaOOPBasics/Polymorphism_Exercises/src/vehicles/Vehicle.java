package vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double distanceTraveled;


    public final void drive(double distance){
        double littersNeeded = distance * calculateFuelCunsuption();
        if (fuelQuantity - littersNeeded < 0){
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " needs refueling");
        }
        DecimalFormat myFormat = new DecimalFormat("###.##");
        System.out.println(this.getClass().getSimpleName() + " travelled "+ myFormat.format(distance)+" km");
        fuelQuantity-= littersNeeded;
    }

    public final void refilFuel(double ammount){
        fuelQuantity += calculateFuelAmmount(ammount);
    }

    protected abstract double calculateFuelAmmount(double ammount);


    protected abstract double calculateFuelCunsuption();

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + String.format("%.2f",getFuelQuantity());
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
