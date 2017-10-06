import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class MultiplyBigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger s =new  BigInteger(reader.readLine());
        BigInteger e =new  BigInteger(reader.readLine());

        System.out.println(s.multiply(e).toString());





    }

    private static String MultiplyNumbers(char[] s, int multiplyer, int n){


        StringBuilder stringBuilder = new StringBuilder();
        if (s.length-1 <= n){
            return stringBuilder.append(Integer.parseInt(String.valueOf(s[n]))+multiplyer).toString();
        }

        stringBuilder.append(MultiplyNumbers(s, multiplyer, n+1));
        return stringBuilder.toString();

    }
}
