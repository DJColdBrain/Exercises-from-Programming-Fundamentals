import java.util.Scanner;

public class p01_Variable_in_Hexadecimal_Format {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hex = scanner.nextLine();
        int dec = Integer.parseInt(hex, 16);
        System.out.println(dec);
    }
}
