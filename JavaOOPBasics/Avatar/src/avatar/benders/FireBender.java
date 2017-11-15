package avatar.benders;

public class FireBender extends Benders {
    private double heatAggression;

    public FireBender(String name, int power, double heatAggression) {
        setName(name);
        setPower(power);
        setHeatAggression(heatAggression);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    private double getHeatAggression() {
        return this.heatAggression;
    }

    private void setHeatAggression(double heatAggression) {
        this.heatAggression = heatAggression;
    }
}
