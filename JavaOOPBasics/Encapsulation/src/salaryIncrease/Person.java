package salaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double bonus) {
        if (this.age < 30){
            bonus = bonus/2;
        }
        this.salary += this.salary * bonus / 100;
    }

    Person(String firstName, String lastName, int age, double salary){
        this.age =age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " gets " + this.getSalary() + " leva";
    }
}
