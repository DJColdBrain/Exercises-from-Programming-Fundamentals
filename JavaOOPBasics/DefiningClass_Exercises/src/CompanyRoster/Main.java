package CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Main {

    private static  LinkedHashMap<String, LinkedList<Employee>> employees = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());



        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split("\\s+");
            if (data.length == 4){
                Employee employee = new Employee(data[0], Double.parseDouble(data[1]), data[2], data[3]);
                addEmployeeToMap(employee);
            }else if (data.length == 5){
                try {
                    Employee employee = new Employee(data[0], Double.parseDouble(data[1]), data[2], data[3], Integer.parseInt(data[4]));
                    addEmployeeToMap(employee);
                }catch (Exception e){
                    Employee employee = new Employee(data[0], Double.parseDouble(data[1]), data[2], data[3], data[4]);
                    addEmployeeToMap(employee);
                }
            }else{
                Employee employee = new Employee(data[0], Double.parseDouble(data[1]), data[2], data[3], data[4],Integer.parseInt(data[5]));
                addEmployeeToMap(employee);
            }
        }

        employees.entrySet().stream().sorted((a,b) ->{
            final Double[] averageA = {0.0};
            final Double[] averageB = {0.0};
            a.getValue().forEach( e -> averageA[0] += e.getSalary());
            b.getValue().forEach( e -> averageB[0] += e.getSalary());
            return Double.compare(averageB[0]/b.getValue().size(),averageA[0]/a.getValue().size());
        }).limit(1).forEach(dep ->{
            System.out.println("Highest Average Salary: " + dep.getKey());
            dep.getValue().stream().sorted((e1, e2)  -> Double.compare(e2.getSalary(), e1.getSalary())).forEach(System.out::println);
        });

    }

    private static void addEmployeeToMap(Employee em) {

        if (!employees.containsKey(em.getDepartament())){
            employees.put(em.getDepartament(), new LinkedList<>());
        }
        employees.get(em.getDepartament()).add(em);
    }

}
