import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndColumns = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[rowsAndColumns[0]][rowsAndColumns[1]];

        char a = 'a';

        for (int i = 0; i < rowsAndColumns[0]; i++) {
            for (int j = 0; j < rowsAndColumns[1]; j++) {
                matrix[i][j] = ""+ (char)(a+ i)+ "" + (char)(a+ j + i) + (char)(a+ i)+"" ;
            }
        }

        for (int i = 0; i < rowsAndColumns[0]; i++) {
            for (int j = 0; j < rowsAndColumns[1]; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
