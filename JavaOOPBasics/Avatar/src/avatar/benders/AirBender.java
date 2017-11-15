package avatar.benders;

public class AirBender extends Benders {
    private double aerialIntegrity;


    public AirBender(String name, int power, double aerialIntegrity) {
        setName(name);
        setPower(power);
        setAerialIntegrity(aerialIntegrity);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private double getAerialIntegrity() {
        return this.aerialIntegrity;
    }

    private void setAerialIntegrity(double aerialIntegrity) {
        this.aerialIntegrity = aerialIntegrity;
    }
}
