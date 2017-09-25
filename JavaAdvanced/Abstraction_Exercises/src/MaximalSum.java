import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndColumns = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[rowsAndColumns[0]][rowsAndColumns[1]];

        for (int i = 0; i < rowsAndColumns[0]; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int maxSum = Integer.MIN_VALUE;
        int[][] numbers = new int[3][3];
        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length -2; j++) {
                int sum = matrix[i][j] + matrix [i][j+1] + matrix[i][j+2];
                sum += matrix[i+1][j] + matrix [i+1][j+1] + matrix[i+1][j+2];
                sum += matrix[i+2][j] + matrix [i+2][j+1] + matrix[i+2][j+2];
                if (sum > maxSum){
                    maxSum = sum;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            numbers[k][l] = matrix[i+k][j+l];
                        }
                    }
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
