import java.util.*;
import java.util.stream.Collectors;

public class GameOfNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        HashMap<String, Integer> players = new HashMap<>();
        String name = " ";
        for (int i = 0; i < n*2; i++) {
            if (i %2 == 0){
                name = scanner.nextLine();
                players.put(name, 0);
            }else{
                int score = Integer.parseInt(scanner.nextLine());
                for (char c: name.toCharArray()) {
                    if (c %2 == 0){
                    score += c;
                    }else{
                        score -= c;
                    }
                }
                players.put(name, score);
            }

        }
        players = sortByValue(players);
        Map.Entry<String , Integer> set = players.entrySet().iterator().next();
        System.out.printf("The winner is %s - %d points", set.getKey(), set.getValue());


    }

    public static <K, V extends Comparable<? super V>> HashMap<K, V> sortByValue(HashMap<K, V> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }
}
