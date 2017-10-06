import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Searching {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(bufferedReader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int searched = Integer.parseInt(bufferedReader.readLine());

        System.out.println(binarySearch(arr, searched));
    }



    public static int binarySearch(int[] arr, int searched){
        if (searched > arr[arr.length-1] || searched < arr[0]){
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = arr[mid];

            if (midVal < searched)
                low = mid + 1;
            else if (midVal > searched)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1;  // key not found
    }


}
