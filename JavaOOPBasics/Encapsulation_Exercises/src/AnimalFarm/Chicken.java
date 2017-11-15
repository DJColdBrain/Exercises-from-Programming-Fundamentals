package AnimalFarm;

public class Chicken {

    private String name;
    private int age;


    Chicken (String name, int age) throws IllegalAccessException {
        setName(name);
        setAge(age);
    }

    private void setName(String name) throws IllegalAccessException {
        if (name.trim().length() <= 0){
            throw new IllegalAccessException("Name cannot be empty.");
        }else{
            this.name = name.trim();
        }
    }

    private void setAge(int age) throws IllegalAccessException {
        if (age <= 0 || age >= 15){
            throw new IllegalAccessException("Age should be between 0 and 15.");
        }else{
            this.age = age;
        }
    }


    private double calculateProductPerDay(){
        if (age < 6){
            return 2;
        }else if (age < 12){
            return 1;
        }else{
            return 0.75;
        }
    }

    public double getPruductionPerDay(){
        return calculateProductPerDay();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
