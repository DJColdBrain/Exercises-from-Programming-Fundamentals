package animals;

public class Frog extends Animal {
    public Frog(String name, String gender, int age) {
        super(name, gender, age);
    }
    public void produceSound(){
        System.out.println("Frogggg");
    }
}
