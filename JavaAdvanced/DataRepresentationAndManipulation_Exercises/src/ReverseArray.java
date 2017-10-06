import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        StringBuilder stringBuilder = new StringBuilder();

        arr = reverseArray(arr, 0);

        for (int i : arr) {
            stringBuilder.append(i + " ");
        }

        System.out.println(stringBuilder.toString());
    }

    public static int[] reverseArray(int[] array, int i){
        int[] arr = new int[array.length];
        if (i >= array.length){
            return arr;
        }
        arr = reverseArray(array, i+1);
        arr[(arr.length-1)-i] = array[i];
        return arr;

    }
}
