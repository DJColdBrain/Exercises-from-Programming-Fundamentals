import java.util.Arrays;
import java.util.Scanner;

public class p09_Most_Frequent_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] nums = new int[array.length];
        int[] timesSeen = new int[array.length];


        for (int i = 0; i < array.length; i++)
        {
            boolean isSeen = false;
            for (int j = 0; j < nums.length; j++)
            {
                if (array[i] == nums[j])
                {
                    timesSeen[j]++;
                    isSeen = true;
                    continue;
                }

            }
            if (!isSeen)
            {
                nums[i] = array[i];
                timesSeen[i] = 1;
            }
        }
        int place = 0;
        int lastBiggest = 0;
        for (int i = 0; i < timesSeen.length; i++)
        {
            if (timesSeen[i] > lastBiggest)
            {
                lastBiggest = timesSeen[i];
                place = i;
            }
        }
        System.out.println(nums[place]);

    }
}
