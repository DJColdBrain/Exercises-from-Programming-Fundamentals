package wildFarm.animals;

import wildFarm.food.Food;

public class Mouse extends Mammal {

    public Mouse(String name, String type, double weight, String region) {
        setAnimalName(name);
        setAnimalType(type);
        setAnimalWeight(weight);
        setLivingRegion(region);
    }

    @Override
    public void eat(Food food) {
        if (!food.getClass().getSimpleName().equals("Vegetable")){
            throw new IllegalArgumentException(this.getClass().getSimpleName() + "s are not eating that type of food!");
        }
        super.eat(food);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }
}
