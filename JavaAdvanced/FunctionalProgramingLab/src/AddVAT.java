import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class AddVAT {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Double> doubles = new ArrayList<>();

        for (String s : reader.readLine().split(", ")) {
            doubles.add(Double.parseDouble(s));
        }

        Function<Double, Double> vat = x -> x = x*1.2;

        System.out.println("Prices with VAT:");
        for (Double aDouble : doubles) {
            String s = String .format("%.2f\r\n", vat.apply(aDouble));
            System.out.printf(s.replaceAll("\\.", ","));
        }
    }
}
