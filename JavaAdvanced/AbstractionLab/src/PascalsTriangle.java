import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        long[][] pascalTriangle = new long[n][];

        for (int i = 0; i < n; i++) {
            pascalTriangle[i] = new long[i+1];
            for (int j = 0; j <= i; j++) {
                if (j - 1 < 0 || j +1 > i || i -1 <= 0){
                    pascalTriangle[i][j] = 1;
                }else{
                    pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < pascalTriangle[i].length; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
