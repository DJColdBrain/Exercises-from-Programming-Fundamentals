import java.util.Arrays;
import java.util.Scanner;

public class p08_Max_Sequence_Of_Increasing_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] parametrs = new int[2];

        int count = 1;

        for (int i = 1; i < array.length; i++)
        {
            if (array[i - 1] >= array[i])
            {
                count = 1;
                continue;
            }
            count++;
            if (count > parametrs[1])
            {
                parametrs[0] = i +1-count;
                parametrs[1] = count;
            }


        }
        int[] result = new int[parametrs[1]];
        for (int i = 0; i < parametrs[1]; i++)
        {
            result[i] = array[parametrs[0]+i ];
        }
        System.out.println(Arrays.toString(result).replaceAll("[\\[\\],]", ""));


    }
}
