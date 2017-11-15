package fragileBaseClass;

public class Main {

    public static void main(String[] args) {
        Predator predator = new Predator();

        predator.eat(new Food());
        System.out.println(predator.getHelth());
    }
}
