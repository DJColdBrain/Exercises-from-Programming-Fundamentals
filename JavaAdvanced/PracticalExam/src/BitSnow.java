import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BitSnow {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = Arrays.stream(reader.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        boolean s = true;
        while (s ){
            s = false;
            for (int i = 0; i < array.length-1; i++) {
                int x1 = array[i + 1];
                int x2 = array[i];
                int temp = x2 & x1;
                array[i + 1] = x2 | x1;
                if (x2 != temp){
                    s = true;
                }
                array[i] = temp;

            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length-1; i++) {
            sb.append(array[i] + ", ");

        }
        sb.append(array[array.length-1]);
        //sb.replace(sb.length()-2, sb.length(), "");
        System.out.print(sb);

    }
}
