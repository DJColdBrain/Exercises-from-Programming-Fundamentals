package wildFarm;

import wildFarm.animals.*;
import wildFarm.food.Food;
import wildFarm.food.Meat;
import wildFarm.food.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Animal> animals = new ArrayList<>();


        while (true){
            String[] animalData = reader.readLine().split("\\s+");
            if (animalData[0].equals("End")){
                break;
            }
            String[] foodData = reader.readLine().split("\\s+");
            String name = animalData[1];
            String type = animalData[0];
            double weight = Double.parseDouble(animalData[2]);
            String region = animalData[3];

            String foodType = foodData[0];
            int foodAmmount = Integer.parseInt(foodData[1]);
            Food food = null;
            switch (foodType){
                case "Vegetable":
                    food = new Vegetable(foodAmmount);
                    break;
                case "Meat":
                    food = new Meat(foodAmmount);
                    break;
            }
            try {


                switch (type) {
                    case "Cat":
                        String breed = animalData[4];
                        Animal cat = new Cat(name, type, weight, region, breed);
                        animals.add(cat);
                        cat.makeSound();
                        cat.eat(food);
                        break;
                    case "Tiger":
                        Animal tiger = new Tiger(name, type, weight, region);
                        animals.add(tiger);
                        tiger.makeSound();
                        tiger.eat(food);
                        break;
                    case "Zebra":
                        Animal zebra = new Zebra(name, type, weight, region);
                        animals.add(zebra);
                        zebra.makeSound();
                        zebra.eat(food);
                        break;
                    case "Mouse":
                        Animal mouse = new Mouse(name, type, weight, region);
                        animals.add(mouse);
                        mouse.makeSound();
                        mouse.eat(food);
                        break;
                }

            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        animals.stream().forEach(System.out::println);
    }
}
