package CarSalesman;

public class Car {
    private String model;
    private String weight;
    private String color;
    private Engine engine;

    public Car(String model,Engine engine, int weight, String color ) {
        this(model, engine);
        this.weight = weight + "";
        this.color = color;
    }

    public Car(String model,Engine engine, String color ) {
        this(model, engine);
        this.color = color;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight + "";

    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = "n/a";
        this.color = "n/a";
    }

    public String getModel() {
        return model;
    }

    public String getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return String.format("%s:%n" +
                "   %s:%n" +
                "       Power: %s%n" +
                "       Displacement: %s%n"  +
                "       Efficiency: %s%n" +
                "   Weight: %s%n" +
                "   Color: %s",
                this.model,
                this.engine.getModel(),
                this.engine.getPower(),
                this.getEngine().getDisplacement(),
                this.getEngine().getEfficiency(),
                this.getWeight(),
                this.getColor()
        );
    }
}
