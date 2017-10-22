import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HandScore {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] cards = reader.readLine().split("\\s+");

        int finalPower = 0;
        String lastSuit = String.valueOf(cards[0].charAt(cards[0].length()-1));
        int multiplyer = 1;
        int currentPower = getPower(String.valueOf(cards[0].charAt(0)));
        for (int i = 1; i < cards.length; i++) {
            String power =String.valueOf(cards[i].charAt(0));
            String suit =String.valueOf(cards[i].charAt(cards[i].length()-1));
            currentPower += getPower(power);
            if (lastSuit.equals(suit)){

                multiplyer++;
                lastSuit = suit;
            }else{
                finalPower += currentPower*multiplyer;
                multiplyer= 1;
                lastSuit = suit;
                currentPower = 0;
            }
            if (i == cards.length-1){
                finalPower += currentPower*multiplyer;
            }
        }
        System.out.print(finalPower);
    }

    private static int getPower(String s){

        switch (s){
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "1":
                return 10;
            case "J":
                return 12;
            case "Q":
                return 13;
            case "K":
                return 14;
            case "A":
                return 15;
                default:
                    return -1;
        }


    }
}
