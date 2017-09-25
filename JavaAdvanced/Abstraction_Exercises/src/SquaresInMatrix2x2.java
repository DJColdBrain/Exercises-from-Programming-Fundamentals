import java.util.Arrays;
import java.util.Scanner;

public class SquaresInMatrix2x2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndColumns = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[rowsAndColumns[0]][rowsAndColumns[1]];

        for (int i = 0; i < rowsAndColumns[0]; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }
        int count = 0;

        for (int i = 0; i < matrix.length -1; i++) {
            for (int j = 0; j < matrix[i].length -1; j++) {
                if (matrix[i][j].charAt(0) == matrix[i][j +1 ].charAt(0) && matrix[i+1][j].charAt(0) == matrix[i +1 ][j +1].charAt(0) &&  matrix[i][j].charAt(0) == matrix[i +1][j].charAt(0)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
