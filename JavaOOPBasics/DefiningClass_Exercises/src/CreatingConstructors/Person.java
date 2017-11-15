package CreatingConstructors;

public class Person {
     String name;
     int age;

    public Person(int age) {
        this.age = age;
        this.name = "No name";
    }

    public Person() {
        this.age = 1;
        this.name = "No name";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
