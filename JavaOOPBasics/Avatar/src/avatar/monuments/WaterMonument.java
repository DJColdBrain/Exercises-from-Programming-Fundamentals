package avatar.monuments;

public class WaterMonument extends Monuments {
    private int WaterAffinity;


    @Override
    public String toString() {
        return super.toString();
    }

    private int getWaterAffinity() {
        return WaterAffinity;
    }

    private void setWaterAffinity(int waterAffinity) {
        WaterAffinity = waterAffinity;
    }
}
