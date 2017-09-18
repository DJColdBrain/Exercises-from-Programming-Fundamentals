import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p19_Phonebook_Upgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, String> phonebook = new TreeMap<String, String>();
        while (true){
            String[] comands = scanner.nextLine().split(" ");
            if (comands[0].equals("END")){
                break;
            }
            if (comands[0].equals("A")){
                String name = comands[1];
                String number = comands[2];
                phonebook.put(name,number);
            }else if (comands[0].equals("S")){
                String name = comands[1];
                if (phonebook.containsKey(name)){
                    System.out.printf("%s -> %s%n", name, phonebook.get(name));
                }else{
                    System.out.printf("Contact %s does not exist.%n", name);
                }
            }else if(comands[0].equals("ListAll")){
                for (Map.Entry<String, String> entry : phonebook.entrySet()) {
                    System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
                }
            }

        }
    }
}

