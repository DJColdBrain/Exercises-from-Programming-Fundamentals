package animals;

public class Cat extends Animal {

    public Cat(String name, String gender, int age) {
        super(name, gender, age);
    }

    public void produceSound(){
        System.out.println("MiauMiau");
    }
}
