import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p12_Bomb_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bomb = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i : numbers) {
            nums.add(i);
        }

        while (nums.contains(bomb[0]))
        {

            int index = nums.indexOf(bomb[0]);
            for (int i = 0; i < bomb[1]; i++)
            {
                if (index > 0)
                {
                    nums.remove(index - 1);
                    index--;
                }
                if (index < nums.size() -1)
                {
                    nums.remove(index + 1);
                }
            }
            nums.remove(index);

        }
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        System.out.println(sum);

    }
}
