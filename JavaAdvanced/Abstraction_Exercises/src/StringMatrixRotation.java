import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String degressToRotate = scanner.nextLine().replace("Rotate(", "").replace(")", "");
        int degrees = Integer.parseInt(degressToRotate) % 360;


        ArrayList<String> rows = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


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

            switch (degrees) {
                case 0:

                    char[][] table = new char[rows.size()][];
                    for (int i = 0; i < rows.size(); i++) {
                        table[i] = rows.get(i).toCharArray();
                    }
                    for (int i = 0; i < table.length; i++) {
                        for (int j = 0; j < table[i].length; j++) {
                            System.out.print(table[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 90:
                    table = new char[maxLenght][rows.size()];
                    int b= rows.size()-1;
                    for (int i = 0; i < maxLenght; i++) {
                        for (int j = 0; j < rows.size(); j++) {
                            if (rows.get(j).length() <= i) {
                                table[i][b-j] = ' ';
                                continue;
                            }
                            table[i][b-j] = rows.get(j).charAt(i);
                        }
                    }
                    for (int i = 0; i < table.length; i++) {
                        for (int j = 0; j < table[i].length; j++) {
                            System.out.print(table[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 180:
                    table = new char[rows.size()][maxLenght];
                    int x = rows.size()-1;
                    for (int i = 0; i < rows.size(); i++) {
                        table[x-i] = (spaces(maxLenght-rows.get(i).length()) + new StringBuilder().append(rows.get(i)).reverse().toString()).toCharArray();
                    }
                    for (int i = 0; i < table.length; i++) {
                        for (int j = 0; j < table[i].length; j++) {
                            System.out.print(table[i][j]);
                        }
                        System.out.println();
                    }

                    break;
                case 270:
                    table = new char[maxLenght][rows.size()];
                    int k = maxLenght - 1;
                    int l = rows.size() - 1;
                    for (int i = maxLenght - 1; i >= 0; i--) {
                        for (int j = rows.size() - 1; j >= 0; j--) {
                            if (rows.get(j).length() <= i) {
                                table[k - i][l - j] = ' ';
                                continue;
                            }
                            table[k - i][j] = rows.get(j).charAt(i);
                        }
                    }
                    for (int i = 0; i < table.length; i++) {
                        for (int j = 0; j < table[i].length; j++) {
                            System.out.print(table[i][j]);
                        }
                        System.out.println();
                    }
                    break;
            }

        }
    public static String spaces( int spaces ) {

        return CharBuffer.allocate( spaces ).toString().replace( '\0', ' ' );
    }
}
