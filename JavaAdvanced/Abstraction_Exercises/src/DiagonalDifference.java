import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
           matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int sumPrimaryDiagonal = sumPrimaryDiagonal(matrix);
        int sumSecondaryDiagonal = sumSecondaryDiagonal(matrix);

        System.out.println(Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal));
    }

    private static int sumPrimaryDiagonal(int[][] matrix){
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }
    private static int sumSecondaryDiagonal(int[][] matrix){
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[(matrix.length-1)-i][i];
        }

        return sum;
    }
}
