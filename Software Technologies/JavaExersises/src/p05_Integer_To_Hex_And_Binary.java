import java.util.Scanner;

public class p05_Integer_To_Hex_And_Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String hex = Integer.toHexString(num).toUpperCase();
        String bin = Integer.toBinaryString(num);
        System.out.println(hex);
        System.out.println(bin);
    }
}
