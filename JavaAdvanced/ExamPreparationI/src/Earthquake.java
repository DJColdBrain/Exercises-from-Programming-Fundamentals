import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Earthquake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(reader.readLine());

        int[][] earth = new int[n][];

        for (int i = 0; i < n; i++) {
            earth[i] = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        List<Integer> map = new ArrayList<>();
        while(true){
            if (earth.length <= 0){
                break;
            }
            if (earth[0].length <= 0){
                int[][] earth1 = new int[earth.length-1][];
                for (int i = 0; i < earth.length - 1; i++) {
                    earth1[i]  = earth[i+1];
                }
                earth = earth1;
                continue;
            }
            int seisnimicActivictie = earth[0][0];

            int[] powers = Arrays.stream(earth[0]).skip(1).toArray();
            int k = powers.length;
            for (int i = 0; i < powers.length; i++) {
                if (seisnimicActivictie >= powers[i]){
                    powers[i] = -1;
                    k--;
                }else{
                    break;
                }
            }
            int[] left = new int[k];
            int t =0;
            for (int i = 0; i < powers.length; i++) {
                if (powers[i] == -1){

                }else{
                    left[t] = powers[i];
                    t++;
                }
            }
            map.add(seisnimicActivictie);
            for (int i = 0; i < earth.length - 1; i++) {
                earth[i]  = earth[i+1];
            }
            earth[earth.length-1] = left;
        }

        System.out.println(map.size());
        StringBuilder stringBuilder = new StringBuilder ();
        for (Integer integer : map) {
            stringBuilder.append(integer + " ");
        }
        System.out.print(stringBuilder);
    }
}
