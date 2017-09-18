import java.util.Arrays;
import java.util.Scanner;

public class p11_Equal_Sums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isThere = false;
        for (int i = 0; i < array.length; i++)
        {
            int k = i;
            int leftSum = 0;
            int rightSum = 0;
            int l = i;
            while (k > 0)
            {
                k--;
                leftSum += array[k];
            }
            while (l < array.length-1 )
            {
                l++;
                rightSum += array[l];
            }
            if (leftSum == rightSum)
            {
                System.out.println(i);
                isThere = true;
                break;
            }

        }
        if (!isThere)
        {
            System.out.println("no");
        }
    }
}
