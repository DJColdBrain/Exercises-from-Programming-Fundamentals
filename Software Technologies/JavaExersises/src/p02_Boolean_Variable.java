import java.util.Scanner;

public class p02_Boolean_Variable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bool = Boolean.parseBoolean(scanner.nextLine());
        if (bool){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
