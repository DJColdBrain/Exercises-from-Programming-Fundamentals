import java.util.Scanner;

public class p04_Vowel_Or_Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  charr = scanner.nextLine();
        String[] vowels = {"a", "e","o", "y","u","i"};

        try {
            int digit = Integer.parseInt(charr);

            System.out.println("digit");
        }catch (NumberFormatException e){
            boolean b = false;
            for (int i = 0; i <vowels.length ; i++) {
                if (charr.contains(vowels[i])){
                    System.out.println("vowel");
                    b =true;
                    break;
                }
            }
            if (!b){
                System.out.println("other");
            }
        }
    }
}
