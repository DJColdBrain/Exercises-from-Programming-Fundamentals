import java.util.*;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }

        int[] criptedArray = criptingArray(array);
        print(criptedArray);
    }

    public static int[] criptingArray(String[] lines){
        List<Character> vowels = new ArrayList<>();
        Collections.addAll(vowels,'a', 'u', 'o', 'i', 'e' ,'A', 'U', 'O', 'I', 'E');
        int[] criptedArray = new int[lines.length];
        for (int i = 0; i < lines.length; i++) {
            int sum = 0;
            for (int j = 0; j < lines[i].length(); j++) {
                if (vowels.contains(lines[i].charAt(j))){
                    sum +=(int) (lines[i].charAt(j)) * lines[i].length();
                }else{
                    sum +=(int) (lines[i].charAt(j)) / lines[i].length();
                }
            }
            criptedArray[i] = sum;
        }
        Arrays.sort(criptedArray);
        return criptedArray;
    }

    public static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
