import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Scanner;

public class StringMatrixRotation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String degressToRotate = scanner.nextLine().replace("Rotate(", "").replace(")", "");
        int degrees = Integer.parseInt(degressToRotate) % 360;

        int times = degrees / 90;

        ArrayList<String> rows = new ArrayList<>();

        while (true) {
            String strings = scanner.nextLine();
            if (strings.equals("END")) {
                break;
            }
            rows.add(strings);
        }

        int maxLenght = 0;
        for (int i = 0; i < rows.size(); i++) {
            if (rows.get(i).length() > maxLenght) {
                maxLenght = rows.get(i).length();
            }
        }

        char[][] table = new char[rows.size()][maxLenght];
        for (int i = 0; i < rows.size(); i++) {
            table[i] = (rows.get(i) + spaces(maxLenght-rows.get(i).length())).toCharArray();
        }
        char[][] newTable;
        for (int z = 0; z < times; z++) {
                 newTable = new char[maxLenght][table.length];
            int k = table.length-1;
            int l = table[0].length;
            for (int i = 0; i < l; i++) {
                for (int j = 0; j <= k; j++) {
                    newTable[i][j] = table[k-j][i];
                }
            }
            maxLenght = table.length;
            table = newTable;
        }



        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }
    public static String spaces( int spaces ) {

        return CharBuffer.allocate( spaces ).toString().replace( '\0', ' ' );
    }
}
