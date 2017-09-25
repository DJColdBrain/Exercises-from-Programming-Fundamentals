import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] params = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(x -> Integer.parseInt(x)).toArray();
        int n = params[0];
        int k = params[1];
        int[][] matrix = new int[n][k];
        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
               sum += matrix[i][j];
            }
        }
        System.out.println(n);
        System.out.println(k);
        System.out.println(sum);
    }
}
