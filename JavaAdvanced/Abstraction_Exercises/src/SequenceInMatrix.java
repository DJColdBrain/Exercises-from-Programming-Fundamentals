import java.util.Arrays;
import java.util.Scanner;

public class SequenceInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndColumns = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String [][] matrix = new String[rowsAndColumns[0]][rowsAndColumns[1]];

        for (int i = 0; i < rowsAndColumns[0]; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }
        String [] data = findEqualElements(matrix);
        int maxLneght = Integer.parseInt(data[0]);
        String symbol = data[1];

        if (symbol.equals("")){
            symbol = matrix[matrix.length][matrix[maxLneght].length];
        }
        String[] symbols = new String[maxLneght];
        for (int j = 0; j < maxLneght; j++) {
            symbols[j] = symbol;

        }
        System.out.print(Arrays.toString(symbols).replaceAll("[\\[\\],]", "").replaceAll(" ", ", "));
    }

    private static String[] findEqualElements(String[][] matrix){
        String[] returned = new String [2];
        int maxLneght = 0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                int lenghtRow = 1;
                int lenghtDiagonal = 1;
                int lenghtColumn = 1;

                String currentSymbol = matrix[i][j];


                int k = i;
                int l = j;
                while (l < matrix[k].length -1){
                    String a = matrix[k][l];
                    String b = matrix[k][l+1];
                    if (!a.equals(b)){
                        break;
                    }
                    l++;
                    lenghtRow++;
                }
                k = i;
                l = j;
                while (k < matrix.length-1){
                    String a = matrix[k][l];
                    String b = matrix[k+1][l];
                    if (!a.equals(b)){
                        break;
                    }
                    k++;
                    lenghtColumn++;
                }
                k = i;
                l = j;
                while (k < matrix.length -1 && l < matrix[k].length -1){
                    String a = matrix[k][l];
                    String b = matrix[k+1][l+1];
                    if (!a.equals(b)){
                        break;
                    }
                    k++;
                    l++;
                    lenghtDiagonal++;
                }
                if (Math.max(Math.max(lenghtColumn, lenghtRow), lenghtDiagonal) >= maxLneght && Math.max(Math.max(lenghtColumn, lenghtRow), lenghtDiagonal) >= 1){
                    maxLneght = Math.max(Math.max(lenghtColumn, lenghtRow), lenghtDiagonal);
                    returned[1] = currentSymbol;
                }
            }
        }
        returned[0] = String .valueOf(maxLneght);

        return returned;
    }

}
