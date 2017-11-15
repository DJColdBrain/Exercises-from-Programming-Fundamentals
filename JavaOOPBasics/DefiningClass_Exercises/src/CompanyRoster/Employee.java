package CompanyRoster;

import java.text.DecimalFormat;

public class Employee {
    String name;
    String email;
    String departament;
    String position;
    int age;
    double salary;

    public Employee(String name, double salary, String position,  String departament) {
        this.name = name;
        this.departament = departament;
        this.position = position;
        this.salary = salary;
        this.email = "n/a";
        this.age = -1;
    }

    public Employee(String name, double salary, String position,  String departament, String email, int age) {
        this(name,salary,position,departament);
        this.age = age;
        this.email = email;
    }

    public Employee(String name, double salary, String position,  String departament, String email) {
        this(name,salary,position,departament);
        this.email = email;
    }

    public Employee(String name, double salary, String position,  String departament, int age) {
        this(name,salary,position,departament);
        this.age = age;
    }

    public String getDepartament() {
        return departament;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return this.name + " " + df.format(this.salary) + " " + this.email + " " + this.age;
    }

}
