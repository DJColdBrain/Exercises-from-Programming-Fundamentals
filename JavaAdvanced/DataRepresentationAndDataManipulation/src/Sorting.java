import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(bufferedReader.readLine().split("\\s+")) .mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i + " ");
        }

        System.out.print(sb.toString());


    }

    public static void bubleSort(int[] arr){
        boolean swaped = true;
        do{
            swaped = false;
            for (int i = 0; i < arr.length -1; i++) {
                if (arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                    swaped = true;
                }
            }
        }while (swaped);
    }public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i +1 ; j < array.length; j++) {
                if (array[min] > array[j]){
                    min  = j;
                }
            }
            swap(array, min, i);
        }
    }

    public static void swap(int[] arr, int indexFirst, int indexSecond){
        int holder= arr[indexFirst];
        arr[indexFirst] = arr[indexSecond];
        arr[indexSecond] = holder;
    }
}
