package vehicles;

public class Car extends Vehicle {


    public Car(double fuelQuantity, double fuelConsumption) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
    }

    @Override
    protected double calculateFuelAmmount(double ammount) {
        return ammount;
    }

    @Override
    protected double calculateFuelCunsuption() {
        return getFuelConsumption() + 0.9;
    }
}
