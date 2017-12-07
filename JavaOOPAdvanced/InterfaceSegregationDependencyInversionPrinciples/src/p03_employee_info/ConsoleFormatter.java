package p03_employee_info;

import p03_employee_info.interfaces.Formater;

public class ConsoleFormatter implements Formater {

    public String format(Iterable<Employee> employees) {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employees) {
            sb.append(employee).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
