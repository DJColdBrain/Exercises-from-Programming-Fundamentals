package vehiclesExtension;

public class Truck extends Vehicle {


    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
        setTankCapacity(tankCapacity);
    }


    @Override
    protected double calculateFuelAmmount(double ammount) {
        return ammount * 0.95;
    }

    @Override
    protected double calculateFuelCunsuption() {
        return getFuelConsumption() + 1.6;
    }

    @Override
    public void refilFuel(double ammount) {
        if (ammount + getFuelQuantity() > getTankCapacity() ){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        super.refilFuel(ammount);
    }
}
