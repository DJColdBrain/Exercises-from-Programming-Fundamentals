import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class CombinationsCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger n = new BigInteger(reader.readLine());

        BigInteger k = new BigInteger(reader.readLine());

        System.out.println(factorial(n).divide(factorial(n.subtract(k)).multiply(factorial(k))));

    }

    private static BigInteger factorial(BigInteger n){
        if (n.compareTo(new BigInteger("1")) < 1){
            return new BigInteger("1");
        }
        return n.multiply(factorial(n.subtract(new BigInteger("1"))));
    }
}
