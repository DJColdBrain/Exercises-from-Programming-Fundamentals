import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapDistricts {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String , List<Integer>> cities = new HashMap<>();
        List<String> tokens = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());
        for (String token : tokens) {
            String[] tokenArgs = token.split(":");
            String citie = tokenArgs[0];
            int population =Integer .parseInt(tokenArgs[1]);
            cities.putIfAbsent(citie, new ArrayList<>());
            cities.get(citie).add(population);
        }



        int powerValue = Integer.parseInt(reader.readLine());


        cities.entrySet().stream()
                .filter(getFilteredByPopulation(powerValue))
                .sorted(getSortedByDescendingPopulationComparator())
                .forEach(getPrintMapEntryConsumer());
    }
    private static Predicate<Map.Entry<String, List<Integer>>> getFilteredByPopulation (int population){
        return  kv -> kv.getValue().stream()
                .mapToInt(Integer::valueOf)
                .sum() >= population;
    }

    private static Comparator<Map.Entry<String, List<Integer>>> getSortedByDescendingPopulationComparator(){
        return (kv1, kv2)->
                Integer.compare(
                        kv2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                        kv1.getValue().stream().mapToInt(Integer::valueOf).sum());
    }

    private static Consumer<Map.Entry<String , List<Integer>>> getPrintMapEntryConsumer(){
        return kv->{
                System.out.print(kv.getKey() + ": ");
                kv.getValue().stream()
                        .sorted(Comparator.reverseOrder())
                        .limit(5)
                        .forEach(dp -> System.out.print(dp + " "));
                System.out.println();
        };
    }
}
