import java.nio.CharBuffer;
import java.util.Scanner;

public class TerroristsWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String de_dust2 = scanner.nextLine();

        for (int i = 0; i < de_dust2.length(); i++) {
            char currentChar= de_dust2.toCharArray()[i];

            int startIndex = -1;
            int finishingIndex = -1;


            int power = 0;
            if (String.valueOf(currentChar).equals("|")){
                startIndex = i;

                for (int j = i+1; j <de_dust2.length() ; j++) {
                    if (String.valueOf(de_dust2.toCharArray()[j]).equals("|")){
                        finishingIndex = j;
                        break;
                    }
                    power += de_dust2.toCharArray()[j];
                }
                power = power % 10;

                startIndex -= power;
                finishingIndex += power +1;
                if (startIndex < 0){
                    startIndex= 0;
                }
                if (finishingIndex >= de_dust2.length()){
                    finishingIndex = de_dust2.length();
                }
                String bomb = de_dust2.subSequence(startIndex, finishingIndex).toString();
                de_dust2 = de_dust2.replace(bomb, dots(bomb.length()));
            }



        }
        System.out.printf(de_dust2);
    }
    public static String dots( int spaces ) {

        return CharBuffer.allocate( spaces ).toString().replace( '\0', '.' );
    }
}
