package animals;

public class Animal {

    private String name;
    private String gender;
    private int age;

    public Animal(String name, String gender, int age) {
        setName(name);
        setGender(gender);
        setAge(age);
    }

    public void setName(String name) {
        if (name == null || name.trim().length() < 1 || name.isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name.trim();
    }

    public void setGender(String gender ) {
        if (gender == null || gender.trim().length() < 1 || gender.isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender.trim();
    }

    public void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.gender;
    }
}
