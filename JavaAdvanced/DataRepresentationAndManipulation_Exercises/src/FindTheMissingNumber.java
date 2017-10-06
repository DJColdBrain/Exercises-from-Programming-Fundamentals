import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindTheMissingNumber  {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] arr = Arrays.stream(reader.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);

        int found = findTheMissingNumber(arr, 0);

        System.out.println(found);

    }
    public static int findTheMissingNumber(int[] arr, int n){
        if (arr.length <= n){
            return n+1;
        }
        if (arr[n] != n+1){
            return n+1;
        }

        return findTheMissingNumber(arr, n+1);
    }
}
