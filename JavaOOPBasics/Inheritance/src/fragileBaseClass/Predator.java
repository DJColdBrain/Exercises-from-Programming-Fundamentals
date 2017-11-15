package fragileBaseClass;

public class Predator extends Animal{

    private int helth = 0;

    public void feed(Food food){
        super.eat(food);
        this.helth++;
    }

    public int getHelth() {
        return helth;
    }
}
