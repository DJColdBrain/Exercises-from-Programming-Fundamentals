package wildFarm.animals;

import wildFarm.food.Food;

public class Tiger  extends Felime{
    private String livingRegion;

    public Tiger(String name, String type, double weight, String region) {
        setAnimalName(name);
        setAnimalType(type);
        setAnimalWeight(weight);
        setLivingRegion(region);
    }

    @Override
    public void eat(Food food) {
        if (!food.getClass().getSimpleName().equals("Meat")){
            throw new IllegalArgumentException(this.getClass().getSimpleName() + "s are not eating that type of food!");
        }
        super.eat(food);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }
}
