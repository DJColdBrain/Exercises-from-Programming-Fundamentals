package detailPrinter;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName();
    }
}
