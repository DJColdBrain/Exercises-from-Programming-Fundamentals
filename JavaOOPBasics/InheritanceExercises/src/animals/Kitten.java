package animals;

public class Kitten extends Cat {
    public Kitten(String name, String gender, int age) {
        super(name, gender, age);
    }

    public void produceSound(){
        System.out.println("Miau");
    }
}
