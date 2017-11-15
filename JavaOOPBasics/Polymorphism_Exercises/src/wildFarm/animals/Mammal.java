package wildFarm.animals;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {

    private String livingRegion;


    protected void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat myFormater= new DecimalFormat("###.##");
        return String.format("%s[%s, "+myFormater.format(getAnimalWeight())+", %s, %d]",
                this.getClass().getSimpleName(),
                getAnimalName(),
                getLivingRegion(),
                getFoodEaten());
    }
}
