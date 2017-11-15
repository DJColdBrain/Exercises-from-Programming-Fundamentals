package fragileBaseClass;

import java.util.ArrayList;

public class Animal {

    protected ArrayList<Food> foodEaten = new ArrayList<>();




    public final void eat(Food food){
        this.foodEaten.add(food);
    }

    public void eatAll(Food[] foods){
        for (Food food : foods) {
            eat(food);
        }
    }
}
