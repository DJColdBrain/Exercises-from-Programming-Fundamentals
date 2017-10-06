import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NestedLoopsToRecursion {

    private static int numberOfLoops;
    private static int[] loops;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        numberOfLoops = Integer.parseInt(reader.readLine());



        loops = new int[numberOfLoops];
        NestedLoops(0);


    }



    static void NestedLoops(int currentLoop)
    {
        if (currentLoop == numberOfLoops)
        {
            PrintLoops();
            return;
        }
        for (int counter = 1; counter <= numberOfLoops; counter++)
        {
            loops[currentLoop] = counter;
            NestedLoops(currentLoop + 1);
        }
    }

    static void PrintLoops()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numberOfLoops; i++)
        {
            stringBuilder.append(loops[i] + " ");
        }

        System.out.println(stringBuilder.toString());
    }




}
