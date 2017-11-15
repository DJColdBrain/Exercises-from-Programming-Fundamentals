package validateData;

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

    Person(String firstName, String lastName, int age, double salary) throws IllegalAccessException {
        setAge(age);
        setFirstName(firstName);
        setLastName(lastName);
        setSalary(salary);
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    private void setFirstName(String firstName) throws IllegalAccessException {
        if (firstName.length()< 3){
            throw new IllegalAccessException("First name cannot be less than 3 symbols");
        }else{
            this.firstName =firstName;
        }
    }

    private void setLastName(String lastName) throws IllegalAccessException {
        if (lastName.length()< 3){
            throw new IllegalAccessException("Last name cannot be less than 3 symbols");
        }else{
            this.lastName =lastName;
        }
    }

    public void setAge(int age) throws IllegalAccessException {
        if (age < 1){
            throw new IllegalAccessException("Age cannot be zero or negative integer");
        }else{
            this.age =age;
        }
    }

    public void setSalary(double salary) throws IllegalAccessException {
        if (salary < 460){
            throw new IllegalAccessException("Salary cannot be less than 460 leva");
        }else{
            this.salary =salary;
        }
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " gets " + this.getSalary() + " leva";
    }
}
