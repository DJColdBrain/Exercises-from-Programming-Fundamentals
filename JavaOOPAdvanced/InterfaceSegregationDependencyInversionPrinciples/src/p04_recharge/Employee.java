package p04_recharge;

public class Employee extends Worker {

    public Employee(String id) {
        super(id);
    }

    public void sleep() {
        // sleep...
    }

    public void recharge() {
        throw new UnsupportedOperationException("Employees cannot recharge");
    }
}
