import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FilterByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] personData = reader.readLine().split(", ");
            String name = personData[0];
            int age = Integer.parseInt(personData[1]);
            people.add(new Person(name, age));
        }
        String ageComparator = reader.readLine().trim();
        int age = Integer.parseInt(reader.readLine());
        switch (ageComparator){
            case "older":
                people.removeIf(x->x.getAge() < age);
                break;
            case "younger":
                people.removeIf(x->x.getAge() >= age);
                break;
        }
        String[] format = reader.readLine().split(" ");
        if (format.length > 1){
            for (Person person : people) {
                System.out.printf("%s - %d%n", person.getName(), person.getAge());
            }
        }else if (format[0].equals("name")){
            for (Person person : people) {
                System.out.printf("%s%n", person.getName());
            }
        }else {
            for (Person person : people) {
                System.out.printf("%d%n", person.getAge());
            }
        }
    }


}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
