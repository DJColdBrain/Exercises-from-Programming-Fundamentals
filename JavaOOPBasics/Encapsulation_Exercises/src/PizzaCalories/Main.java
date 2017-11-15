package PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        try {
            Pizza pizza = null;
            Dough dough = null;
            for (int i = 0; i < 2; i++) {
                String[] pizzaData = reader.readLine().split("\\s+");
                if (pizzaData[0].equals("Pizza")){
                    pizza = new Pizza(pizzaData[1], Integer.parseInt(pizzaData[2]));
                }else if (pizzaData[0].equals("Dough")){
                    dough = new Dough(pizzaData[1], pizzaData[2],Integer.parseInt(pizzaData[3]));
                }
            }
            if (pizza == null) {

            }else {
                pizza.setDough(dough);
                for (int i = 0; i < pizza.getNumberOfTopping(); i++) {
                    String[] toppingData = reader.readLine().split("\\s+");
                    Topping topping = new Topping(toppingData[1], Integer.parseInt(toppingData[2]));
                    pizza.addTopping(topping);
                }

                System.out.printf("%s - %.2f", pizza.getName(), pizza.getCallories());
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
