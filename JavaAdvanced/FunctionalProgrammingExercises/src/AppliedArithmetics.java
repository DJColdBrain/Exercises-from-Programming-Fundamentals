import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AppliedArithmetics {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        
        while (true){
            String command = reader.readLine();
            if (command.equals("end")){
                break;
            }

            switch (command){
                case "print":System.out.println(Arrays.toString(numbers).replace("]","").replace("[","").replace(",",""));break;
                case "add": numbers = Arrays.stream(numbers).map(a -> a + 1 ).toArray();break;
                case "multiply" : numbers = Arrays.stream(numbers).map(a -> a * 2 ).toArray();break;
                case "subtract" : numbers = Arrays.stream(numbers).map(a -> a - 1 ).toArray();break;
            }
            
        }
    }
}
