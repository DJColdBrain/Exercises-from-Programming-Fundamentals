import java.util.*;

/**
 * Created by DJColdBrain on 02-Aug-17.
 */
public class p18_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> phonebook = new HashMap<String, String>();
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
            }

        }
    }
}
