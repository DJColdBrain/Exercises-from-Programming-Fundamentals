package person;

public class Person {
    private String name;
    private int age;



    public Person(String name, int age) {
        this.setAge(age);
        this.setName(name);
    }

    protected void setName(String name) {
        if (name.length() < 3){
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }else{
            this.name = name;
        }
    }

    protected void setAge(int age) {
        if (age < 1){
            throw new IllegalArgumentException("Age must be positive!");
        }else{
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Age: "+this.getAge();
    }
}
