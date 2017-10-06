import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int key = Integer.parseInt(reader.readLine());
        System.out.println(binarySearch(arr, key, 0, arr.length-1));
    }

    public static int binarySearch(int[] arr, int key, int start, int end){
        if (start > end){
            return -1;
        }

        int mid = (start + end)/2;
        if (key == arr[mid]){
            return mid;
        }else
        if (key < arr[mid]){
            return binarySearch(arr, key, start, mid-1);
        }else {
            return binarySearch(arr, key, mid+1, end);
        }

    }
}
