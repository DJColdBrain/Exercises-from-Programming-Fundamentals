import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BitRoller {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int f = Integer.parseInt(reader.readLine());
        int r = Integer.parseInt(reader.readLine());

        String numberBinary = String.format("%19s", Integer.toBinaryString(n)).replace(" ", "0");
       // System.out.print(numberBinary);
        f = numberBinary.length() -f -1;
        for (int i = 0; i < r; i++) {
            char first =(numberBinary.charAt(numberBinary.length()-1));
            char[] arr = numberBinary.toCharArray();
            for (int j = numberBinary.length()-1; j >= 1; j--) {
                if (f == j){
                    continue;
                }if (f+1 == j){
                    if (f == 0){
                        arr[j] = first;
                        break;
                    }else{
                        arr[j] = arr[j-2];
                        continue;
                    }
                }
                arr[j] = arr[j-1];

            }
            if (f == 0){

                numberBinary = Arrays.toString(arr).replaceAll("[\\[\\], ]","");
                continue;
            }
            arr[0] = first;
            numberBinary = Arrays.toString(arr).replaceAll("[\\[\\], ]","");

        }

        System.out.print(Integer.parseInt(numberBinary,2));
    }
}
