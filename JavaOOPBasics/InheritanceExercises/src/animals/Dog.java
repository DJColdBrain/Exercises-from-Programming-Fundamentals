package animals;

public class Dog extends Animal {
    public Dog(String name, String gender, int age) {
        super(name, gender, age);
    }
    public void produceSound(){
        System.out.println("BauBau");
    }
}
