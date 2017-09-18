import java.util.Scanner;

/**
 * Created by DJColdBrain on 02-Aug-17.
 */
public class p17_Change_To_Uppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       StringBuilder text2 = new StringBuilder(scanner.nextLine());
        while(true){
            if (text2.indexOf("<upcase>") > -1){
                text2 = text2.replace(text2.indexOf("<upcase>"), text2.indexOf("</upcase>")+9, text2.substring(text2.indexOf("<upcase>") + 8,text2.indexOf("</upcase>") ).toUpperCase() );
            }else{
                break;
            }
        }
        System.out.println(text2);

    }
}
