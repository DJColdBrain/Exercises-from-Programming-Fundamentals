import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CustomComparator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        arr = compareAndSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    private static int[] compareAndSort(int[] arr){
        int[] evenArr = Arrays.stream(arr).filter(x->x%2 ==0).toArray();
        int[] oddArr = Arrays.stream(arr).filter(x->x%2 !=0).toArray();

        Arrays.sort(evenArr);
        Arrays.sort(oddArr);

        int[] array = new int[evenArr.length+ oddArr.length];
        for (int i = 0; i < evenArr.length; i++) {
            array[i] = evenArr[i];
        }
        for (int i = evenArr.length; i < evenArr.length + oddArr.length; i++) {
            array[i] = oddArr[i-evenArr.length];
        }

        return array;
    }


}


