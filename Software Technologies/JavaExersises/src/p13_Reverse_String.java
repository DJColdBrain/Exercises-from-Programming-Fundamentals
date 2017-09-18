import java.util.Scanner;

public class p13_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        String fin = "";
        for (int i = chars.length-1; i >=0 ; i--) {
            fin += chars[i];
        }
        System.out.println(fin);
    }
}
