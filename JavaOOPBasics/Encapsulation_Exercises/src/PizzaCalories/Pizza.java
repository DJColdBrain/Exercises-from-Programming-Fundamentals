package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> toppings;
    private int numberOfTopping;


    Pizza(String name, int numberOfToppings){
        setName(name);
        setToppings(numberOfToppings);

        toppings = new ArrayList<>();
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int numberOfTopping){
        if (numberOfTopping < 0 || numberOfTopping >10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }else{
            this.numberOfTopping = numberOfTopping;
        }
    }

    public int getNumberOfTopping() {
        return numberOfTopping;
    }

    private void setName(String name) {
        if (name.trim().length() <1 || name.trim().length() > 15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }else{
            this.name = name.trim();
        }
    }

    public String getName() {
        return name;
    }

    public double getCallories(){
        double doughCallories = this.dough.calculateCallories();
        double toppingCallories = this.toppings.stream().mapToDouble(Topping::getCallories).sum() * 2;

       return doughCallories + toppingCallories;
    }

    public void addTopping(Topping topping){
        toppings.add(topping);
    }
}
