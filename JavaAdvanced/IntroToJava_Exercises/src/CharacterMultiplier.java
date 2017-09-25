import java.util.Arrays;
import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] string = scanner.nextLine().split("\\W+");
        char[] firstString = string[0].toCharArray();
        char[] secondString = string[1].toCharArray();

        int min = Math.min(firstString.length, secondString.length);
        int sum = 0;
        for (int i = 0; i < min; i++) {
            sum = sum +(firstString[i] * secondString[i]);
        }
        if (firstString.length > secondString.length){
            for (int i = min; i < firstString.length; i++) {
                sum = sum + firstString[i];
            }
        }else{
            for (int i = min; i < secondString.length; i++) {
                sum = sum + secondString[i];
            }
        }

        System.out.print(sum);
    }
}
