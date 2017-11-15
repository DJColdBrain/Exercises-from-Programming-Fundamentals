package ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, Person> shoppers = new LinkedHashMap<>();
        LinkedHashMap<String, Product> products = new LinkedHashMap<>();
        String[] people = reader.readLine().split(";");
        try {


            for (int i = 0; i < people.length; i++) {
                Person person =  new Person(people[i]);
                String name = people[i].split("=")[0];
                shoppers.put(name,person);

            }
            String[] productss = reader.readLine().split(";");
            for (int i = 0; i < productss.length; i++) {
                Product product =  new Product(productss[i]);
                String name = productss[i].split("=")[0];
                products.put(name, product);
            }

            while (true){
                String commands = reader.readLine();
                if (commands.equals("END")){
                    break;
                }
                String person = commands.split("\\s+")[0];
                String product = commands.split("\\s+")[1];

                shoppers.get(person).addProduct(products.get(product));
            }



            for (Person person : shoppers.values()) {
                if (person.getProducts().size() != 0){
                    System.out.print(person.getName() + " - ");
                    StringBuilder sb = new StringBuilder();
                    person.getProducts().stream().forEach(e -> sb.append(e.getName() + ", "));
                    sb.replace(sb.length()-2 , sb.length(), "");
                    System.out.println(sb);
                }else{
                    System.out.println(person.getName() + " - Nothing bought");
                }
            }

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
