import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by DJColdBrain on 02-Aug-17.
 */
public class p15_Censor_Email_Adress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] email = scanner.nextLine().split("@");
        String fullEmail = email[0] + "@" + email[1];
        String censorship ="";
        for (int i = 0; i <email[0].length() ; i++) {
            censorship += "*";
        }
        String censoredEmail = censorship + "@" + email[1];

        String text = scanner.nextLine();
        text = text.replaceAll(fullEmail, censoredEmail);
        System.out.println(text);
    }
}
