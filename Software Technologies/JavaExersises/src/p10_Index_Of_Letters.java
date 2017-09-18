import java.util.Scanner;

public class p10_Index_Of_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
            System.out.printf("%c -> %d%n", chars[i], (int)chars[i]-97);
        }
    }
}
