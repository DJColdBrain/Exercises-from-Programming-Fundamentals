package RawData;

import java.util.HashMap;

public class Car {

    private String name;
    private Engine engine;
    private Cargo cargo;
    private HashMap<Integer, Tire> tires;


    public Car(String[] details){
        this.name = details[0];
        this.engine = new Engine(Integer.parseInt(details[1]),Integer.parseInt(details[2]));
        this.cargo = new Cargo(details[4], Integer.parseInt(details[3]));
        this.tires = new HashMap<>();
        tires.put(1, new Tire(Integer.parseInt(details[6]), Double.parseDouble(details[5])));
        tires.put(2, new Tire(Integer.parseInt(details[8]), Double.parseDouble(details[7])));
        tires.put(3, new Tire(Integer.parseInt(details[10]), Double.parseDouble(details[9])));
        tires.put(4, new Tire(Integer.parseInt(details[12]), Double.parseDouble(details[11])));
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public HashMap<Integer, Tire> getTires() {
        return tires;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
