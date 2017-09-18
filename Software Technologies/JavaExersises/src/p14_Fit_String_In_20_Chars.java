import java.util.Scanner;

/**
 * Created by DJColdBrain on 02-Aug-17.
 */
public class p14_Fit_String_In_20_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (str.length()> 20){
            str = str.substring(0, 20);

        }else if (str.length()< 20) {
            str = rightPadding(str);
        }
        System.out.println(str);
    }

    public static String rightPadding(String str){
        for (int i = str.length(); i < 20; i++) {
            str += "*";
        }
        return str;
    }
}
