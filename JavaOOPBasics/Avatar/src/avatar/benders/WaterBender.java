package avatar.benders;

public class WaterBender extends Benders {
    private double waterClarity;

    public WaterBender(String name, int power, double waterClarity) {
        setName(name);
        setPower(power);
        setWaterClarity(waterClarity);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private double getWaterClarity() {
        return this.waterClarity;
    }

    private void setWaterClarity(double waterClarity) {
        this.waterClarity = waterClarity;
    }
}
