import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numsAsString = scanner.nextLine().split("\\s+");
        String[] commandArgs = scanner.nextLine().split("\\s+");

        int numOfElementsToGet = Integer.parseInt(commandArgs[1]);
        String oddOrEven = commandArgs[2];

        getFirstOddOrEvenNNumbers(numsAsString, numOfElementsToGet, oddOrEven);
    }

    private static void getFirstOddOrEvenNNumbers(String[] numsAsString, int numOfElementsToGet, String oddOrEven) {
        if (numOfElementsToGet == 0)
            return;

        int counter = 0;
        if (oddOrEven.equals("even")) {
            for (int i = 0; i < numsAsString.length; i++) {
                if (Math.abs(Integer.parseInt(numsAsString[i])) % 2 == 0) {
                    System.out.print(numsAsString[i] + " ");
                    counter++;

                    if (counter == numOfElementsToGet)
                        return;
                }
            }
        } else {
            for (int i = 0; i < numsAsString.length; i++) {
                if (Math.abs(Integer.parseInt(numsAsString[i])) % 2 == 1) {
                    System.out.print(numsAsString[i] + " ");
                    counter++;

                    if (counter == numOfElementsToGet)
                        return;
                }
            }
        }
    }
}
