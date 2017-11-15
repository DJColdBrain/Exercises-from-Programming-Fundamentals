package wildFarm.animals;

import java.text.DecimalFormat;

public class Cat extends Felime {

    private String breed;

    public Cat(String name, String type, double weight, String region , String breed) {
        setAnimalName(name);
        setAnimalType(type);
        setAnimalWeight(weight);
        setLivingRegion(region);
        setBreed(breed);
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }


    @Override
    public String toString() {
        DecimalFormat myFormater= new DecimalFormat("###.##");
        return String.format("%s[%s, %s, "+myFormater.format(getAnimalWeight())+", %s, %d]",
                this.getClass().getSimpleName(),
                getAnimalName(),
                getBreed(),
                getLivingRegion(),
                getFoodEaten());
    }
}
