import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Chocolates {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] arr = Arrays.stream(reader.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int k = Integer.parseInt(reader.readLine());

        Arrays.sort(arr);

        int minDiff = minimalDifferenceInIntArray(arr , 0, k);

        System.out.printf("Min Difference is %d.", minDiff);

    }

    public static int minimalDifferenceInIntArray(int[] arr, int start , int k ){
        if (k > arr.length){
            return Integer.MAX_VALUE;
        }
        int min = Math.abs(arr[start]-arr[k-1]);

        return Math.min(min , minimalDifferenceInIntArray(arr, start+1, k+1));
    }
}
