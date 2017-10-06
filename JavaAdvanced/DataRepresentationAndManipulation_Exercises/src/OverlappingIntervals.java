import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OverlappingIntervals {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[][] arr =new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i] = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        }
        selectSort(arr);

        boolean b = false;

        for (int i = 0; i < n-1; i++) {
            if (arr[i][1] >= arr[i+1][0]){
                b = true;
                break;
            }
        }
        System.out.println(b);

    }

    public static void selectSort(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i +1 ; j < array.length; j++) {
                if (array[min][0] > array[j][0]){
                    min  = j;
                }
            }
            swap(array, min, i);
        }
    }
    public static void swap(int[][] arr, int indexFirst, int indexSecond){
        int[] holder= arr[indexFirst];
        arr[indexFirst] = arr[indexSecond];
        arr[indexSecond] = holder;
    }
}
