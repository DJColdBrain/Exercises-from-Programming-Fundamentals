package wildFarm.animals;

import wildFarm.food.Food;

public abstract class Animal  {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten = 0;


    public abstract void makeSound();

    public void eat(Food food) {
        foodEaten+= food.getQuantity();
    }

    protected void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    protected void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    protected void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

    protected String getAnimalName() {
        return animalName;
    }

    protected String getAnimalType() {
        return animalType;
    }

    protected double getAnimalWeight() {
        return animalWeight;
    }

    protected int getFoodEaten() {
        return foodEaten;
    }
}
