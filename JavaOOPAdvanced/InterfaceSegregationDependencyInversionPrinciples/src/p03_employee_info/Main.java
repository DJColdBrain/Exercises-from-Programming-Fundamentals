package p03_employee_info;

import p03_employee_info.interfaces.Database;
import p03_employee_info.interfaces.Formater;
import p03_employee_info.interfaces.InfoProvider;

public class Main {

    public static void main(String[] args) {
        Database database = new EmployeeDatabase();
        InfoProvider employeeInfo = new EmployeeInfoProvider(database);
        Formater formatter = new ConsoleFormatter();

        String output = formatter.format(employeeInfo.getEmployeesBySalary());
        System.out.println(output);
    }
}
