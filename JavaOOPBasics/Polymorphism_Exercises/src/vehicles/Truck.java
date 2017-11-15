package vehicles;

public class Truck extends Vehicle{


    public Truck(double fuelQuantity, double fuelConsumption) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
    }


    @Override
    protected double calculateFuelAmmount(double ammount) {
        return ammount * 0.95;
    }

    @Override
    protected double calculateFuelCunsuption() {
        return getFuelConsumption() + 1.6;
    }
}
