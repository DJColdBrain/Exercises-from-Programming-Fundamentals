package CarSalesman;

public class Engine {
    private String model;
    private String power;
    private String displacement;
    private String efficiency;

    public Engine(String model, String power){
        this.model = model;
        this.power = power;
        this.displacement = "n/a";
        this.efficiency = "n/a";
    }

    public Engine(String model, String power, int displacement){
        this(model, power);
        this.displacement = String.valueOf(displacement);
    }
    public Engine(String model, String power, String efficiency){
        this(model, power);
        this.efficiency = efficiency;
    }public Engine(String model, String power, int displacement, String efficiency){
        this(model, power);
        this.displacement = displacement + "";
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public String getPower() {
        return power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
