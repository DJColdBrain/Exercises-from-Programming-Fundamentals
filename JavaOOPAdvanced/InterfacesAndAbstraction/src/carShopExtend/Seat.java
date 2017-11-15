package carShopExtend;


public class Seat implements Sellable {

    private String model;
    private String color;
    private int horsePower;
    private String countryProduced;
    private double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
        this.price = price;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return "This is "+ this.model +" produced in "+ this.countryProduced +" and have "+ Car.TIRES +" tires";
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
