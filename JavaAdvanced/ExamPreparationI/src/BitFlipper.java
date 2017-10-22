

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BitFlipper {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger number = new BigInteger(reader.readLine());
        String bytes = number.toString(2);

        List<Integer> indexesOfOnes = new ArrayList<>();
        List<Integer> indexesOfZeros = new ArrayList<>();


        while(bytes.contains("111")){
            indexesOfOnes.add(bytes.indexOf("111"));
            bytes = bytes.replaceFirst("111","000");
        }
        bytes = number.toString(2);

        while(bytes.contains("000")){
            indexesOfZeros.add(bytes.indexOf("000"));
            bytes = bytes.replaceFirst("000","111");
        }

        String result = number.toString(2);
        StringBuilder sb = new StringBuilder(result);
        for (int i = 0; i < indexesOfOnes.size(); i++) {
            int n = indexesOfOnes.get(i);
            sb = sb.replace(n, n+3, "000");
        }
        for (int i = 0; i < indexesOfZeros.size(); i++) {
            int n = indexesOfZeros.get(i);
            sb = sb.replace(n, n+3, "111");

        }
        String  s = sb.toString().replace("\uFEFF", "");
        System.out.println(new BigInteger(s, 2));

    }

}
