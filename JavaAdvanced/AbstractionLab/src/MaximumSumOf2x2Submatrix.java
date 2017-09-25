import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] params = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(x -> Integer.parseInt(x)).toArray();
        int n = params[0];
        int k = params[1];
        int[][] matrix = new int[n][k];

        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        int maxSum = Integer.MIN_VALUE;
        int[][] indexes = new int[2][2];

        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < k-1; j++) {
                int sum = matrix[i][j] + matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1];
                if (sum > maxSum){
                    indexes[0][0] = matrix[i][j];
                    indexes[0][1] = matrix[i][j+1];
                    indexes[1][0] = matrix[i+1][j];
                    indexes[1][1] = matrix[i+1][j+1];
                    maxSum = sum;
                }
            }
        }
        print(indexes, maxSum);


    }
    public  static void print(int[][] positions, int sum){
        System.out.printf("%d %d\n", positions[0][0], positions[0][1]);
        System.out.printf("%d %d\n", positions[1][0], positions[1][1]);
        System.out.println(sum);
    }
}
