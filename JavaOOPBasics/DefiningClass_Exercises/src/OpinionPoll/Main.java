package OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, Person> people = new LinkedHashMap<>();
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split("\\s+");
            Person person = new Person(data[0], Integer.parseInt(data[1]));
            people.put(data[0], person);
        }

        people = people.entrySet().stream().filter(e-> e.getValue().age > 30).sorted(Comparator.comparing(e->e.getKey())).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (x, y) -> {throw  new AssertionError();},
                LinkedHashMap::new
        ));

        for (Map.Entry<String, Person> stringPersonEntry : people.entrySet()) {
            System.out.println(stringPersonEntry.getValue().name + " - " + stringPersonEntry.getValue().age);
        }

    }
}
