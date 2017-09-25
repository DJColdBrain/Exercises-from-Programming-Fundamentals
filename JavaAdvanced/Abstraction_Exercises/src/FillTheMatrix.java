import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commands = scanner.nextLine().split(", ");

        int n =Integer.parseInt( commands[0]);
        String pattern = commands[1].trim();
        int[][] matrix = new int[n][n];

        int count = 0;
        if (pattern.equals("A")){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[j][i] = ++count;
                }
            }
        }
        if (pattern.equals("B")){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i % 2 ==0){
                        matrix[j][i] = ++count;
                    }else{
                        matrix[n-1-j][i] = ++count;
                    }
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
