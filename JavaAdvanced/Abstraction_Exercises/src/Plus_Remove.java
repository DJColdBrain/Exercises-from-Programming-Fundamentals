import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Plus_Remove {
    public static void main(String[] args) {

        ArrayList<String> rows = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {


        while (true){
            String strings = reader.readLine();

            if (strings.equals("END")){
                break;
            }
            rows.add(strings);
        }
        }catch (IOException ioe){

        }
        int maxLenght = 0;
        char[][] table = new char[rows.size()][];
        for (int i = 0; i < rows.size(); i++) {
            table[i] = rows.get(i).toCharArray();
                if (rows.get(i).length()> maxLenght){
                maxLenght = rows.get(i).length();
            }
        }
        ArrayList<int[]> possitions = new ArrayList<>();
        char[][] newTable = new char[table.length][maxLenght];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                int[] poss = new int[] {i, j};
                if (isNotInTable(table, i, j)){
                    if (!isInList(possitions, poss)){
                        newTable[i][j] = table[i][j];
                    }
                }else{

                    if (isPlus(table, i, j)){
                        for (int k = -1; k < 2; k++) {
                            int[] possition = new int[] {i+1, j + k};
                            if (!isInList(possitions,possition)){
                                possitions.add(possition);
                            }
                        }
                        int[] possition = new int[] {i+2, j};
                        if (!isInList(possitions,possition)){
                            possitions.add(possition);
                        }
                    }else{
                        if (!isInList(possitions, poss)) {
                            newTable[i][j] = table[i][j];
                        }
                    }
                }
            }
        }

        for (int i = 0; i < newTable.length; i++) {
            System.out.println(Arrays.toString(newTable[i]).replaceAll("[\\[,\\] ]",""));
        }
    }
    public static boolean isInList(
            final List<int[]> list, final int[] candidate) {

        return list.stream().anyMatch(a -> Arrays.equals(a, candidate));
    }
    public static boolean isPlus(char[][] table, int i, int j){
       if(String.valueOf(table[i][j]).toLowerCase().equals(String.valueOf(table[i+1][j]).toLowerCase())
                && String.valueOf(table[i][j]).toLowerCase().equals(String.valueOf(table[i+1][j-1]).toLowerCase())
                && String.valueOf(table[i][j]).toLowerCase().equals(String.valueOf(table[i+1][j +1]).toLowerCase())
                && String.valueOf(table[i][j]).toLowerCase().equals(String.valueOf(table[i+2][j]).toLowerCase())){
            return true;
        }
        return false;
    }
    public static boolean isNotInTable(char[][] table, int i, int j){
        if (i + 2 >= table.length ||  j+1 >= table[i+1].length || j < 1 || j >= table[i+2].length ){
            return true;
        }
        return  false;
    }
}
