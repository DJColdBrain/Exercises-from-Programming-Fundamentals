package PizzaCalories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dough {

    private List<String> validDoughtTypes;
    private String wholeGrain;
    private String type;
    private int weight;


    Dough (String wholeGrain, String type, int weight){
        validDoughtTypes = new ArrayList<>();
        Collections.addAll(validDoughtTypes, "white", "wholegrain", "crispy", "chewy", "homemade");
        setWholeGrain(wholeGrain);
        setType(type);
        setWeight(weight);
    }

    private void setWeight(int weight) {
       if (weight < 1 || weight > 200){
           throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
       }else{
           this.weight = weight;
       }
    }

    private void setWholeGrain(String wholeGrain) {
        if (!validDoughtTypes.contains(wholeGrain.toLowerCase())){
            throw new IllegalArgumentException("Invalid type of dough.");
        }else {
            this.wholeGrain = wholeGrain.toLowerCase();
        }
    }

    private void setType(String type) {
        if (!validDoughtTypes.contains(type.toLowerCase())){
            throw new IllegalArgumentException("Invalid type of dough.");
        }else {
            this.type = type.toLowerCase();
        }
    }

    private Double getModifier(String name){
        switch (name){
            case "white":
                return 1.5;
            case "wholegrain":
                return  1.0;
            case "crispy":
                return 0.9;
            case "chewy":
                return 1.1;
            case "homemade":
                return 1.0;
            default:
                return 2.0;
        }
    }

    public double calculateCallories(){
        return (2 * weight) * getModifier(type) * getModifier(wholeGrain);
    }
}
