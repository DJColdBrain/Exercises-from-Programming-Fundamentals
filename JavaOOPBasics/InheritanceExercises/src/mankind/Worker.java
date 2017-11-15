package mankind;

public class Worker extends Human {

    private double salary;
    private double workHours;

    Worker(String firstName, String lastName, double salary, double workHours) {
        super(firstName, lastName);
        setSalary(salary);
        setWorkHours(workHours);
    }

    private void setSalary(double salary) {
        if (salary <= 10){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.salary = salary;
    }

    private void setWorkHours(double workHours) {
        if (workHours < 1 || workHours > 12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.workHours = workHours;
    }

    private double getSalaryPerHour(){
        return this.salary / this.workHours / 7;
    }

    @Override
    public String toString() {
        return String.format("First Name: "+ super.getFirstName() +
                "\nLast Name: " + super.getLastName() +
                "\nWeek Salary: : %.2f" +
                "\nHours per day: %.2f" +
                "\nSalary per hour: %.2f" ,this.salary, this.workHours, getSalaryPerHour());
    }

}
