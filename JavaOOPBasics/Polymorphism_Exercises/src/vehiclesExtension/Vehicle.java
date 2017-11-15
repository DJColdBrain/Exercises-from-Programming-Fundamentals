package vehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity = 0;
    private double fuelConsumption;
    private double distanceTraveled;
    private double tankCapacity;
    private boolean isEmpty;




    public final void drive(double distance){
        double littersNeeded = distance * calculateFuelCunsuption();
        if (fuelQuantity - littersNeeded < 0){
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " needs refueling");
        }
        DecimalFormat myFormat = new DecimalFormat("###.##");
        System.out.println(this.getClass().getSimpleName() + " travelled "+ myFormat.format(distance)+" km");
        fuelQuantity-= littersNeeded;
    }

    public void refilFuel(double ammount){
        setFuelQuantity(calculateFuelAmmount(ammount));
    }

    protected abstract double calculateFuelAmmount(double ammount);


    protected abstract double calculateFuelCunsuption();

    public void setFuelQuantity(double fuelQuantity) {

        if (fuelQuantity <= 0){
            throw new IllegalArgumentException( "Fuel must be a positive number");
        }
        this.fuelQuantity += fuelQuantity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setTankCapacity(double tankCapacity) {
       this.tankCapacity = tankCapacity;
    }

    public void setEmpty(String empty) {
        if (empty.equals("DriveEmpty")){
            this.isEmpty = true;
        }
       this.isEmpty = false;
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

    public double getTankCapacity() {
        return tankCapacity;
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
