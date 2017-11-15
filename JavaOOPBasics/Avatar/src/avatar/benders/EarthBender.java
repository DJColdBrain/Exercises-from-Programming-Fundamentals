package avatar.benders;

public class EarthBender extends Benders {
    private double groundSaturation;

    public EarthBender(String name, int power, double groundSaturation) {
        setName(name);
        setPower(power);
        setGroundSaturation(groundSaturation);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private double getGroundSaturation() {
        return this.groundSaturation;
    }

    private void setGroundSaturation(double groundSaturation) {
        this.groundSaturation = groundSaturation;
    }
}
