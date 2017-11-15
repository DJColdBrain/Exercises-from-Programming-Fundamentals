package PizzaCalories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Topping {

    private List<String> validToppingType = new ArrayList<>();
    private String type;
    private int gramms;

    Topping(String type, int gramms){
        Collections.addAll(validToppingType, "meat", "veggies", "sauce", "cheese");
        setType(type);
        setGramms(gramms);
    }

    private void setType(String type) {
        if (!validToppingType.contains(type.toLowerCase())){
            throw new IllegalArgumentException("Cannot place " + String.valueOf(type.charAt(0)).toUpperCase() + type.substring(1) +  " on top of your pizza.");
        }else {
            this.type = type.toLowerCase();
        }
    }

    public void setGramms(int gramms) {
        if (gramms < 1 || gramms > 50){
            throw new IllegalArgumentException(String.valueOf(type.charAt(0)).toUpperCase() + type.substring(1)  + " weight should be in the range [1..50].");
        }else{
            this.gramms = gramms;
        }
    }

    private Double getToppingModifier(){
        switch (this.type){
            case "meat":
                return 1.2;
            case "veggies":
                return  0.8;
            case "cheese":
                return 1.1;
            case "sauce":
                return 0.9;
                default:
                    return 2.0;
        }
    }

    public double getCallories(){
        return this.gramms * getToppingModifier();
    }

}
