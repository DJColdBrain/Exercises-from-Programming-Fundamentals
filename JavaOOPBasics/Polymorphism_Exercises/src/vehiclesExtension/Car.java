package vehiclesExtension;

public class Car extends Vehicle {


    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
        setTankCapacity(tankCapacity);
    }

    @Override
    protected double calculateFuelAmmount(double ammount) {
        return ammount;
    }

    @Override
    protected double calculateFuelCunsuption() {
        return getFuelConsumption() + 0.9;
    }

    @Override
    public void refilFuel(double ammount) {
        if (ammount + getFuelQuantity() > getTankCapacity() ){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        super.refilFuel(ammount);
    }
}
