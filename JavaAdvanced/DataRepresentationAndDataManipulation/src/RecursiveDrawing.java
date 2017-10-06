import java.util.Scanner;

public class RecursiveDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        draw(n);
    }

    private static void draw(int n){

        if (n <=0){
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append('*');
        }
        System.out.println(sb.toString());
        draw(n-1);
        sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append('#');
        }
        System.out.println(sb.toString());
    }
}
