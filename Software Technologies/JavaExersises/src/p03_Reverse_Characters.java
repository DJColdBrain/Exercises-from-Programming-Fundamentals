
import java.util.Scanner;

public class p03_Reverse_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] chars = new String[3];
        for (int i = 2; i >= 0; i--) {
            chars[i] = scanner.nextLine();
        }
        String str ="" ;
        for (int i = 0; i < 3; i++) {
            str += chars[i];
        }
        System.out.println(str);
    }
}
