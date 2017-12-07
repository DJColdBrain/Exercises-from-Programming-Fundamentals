package p04_recharge;

public class EmployeeAdapter extends Employee implements Sleeper {
    public EmployeeAdapter(String id) {
        super(id);
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
