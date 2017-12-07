package listUtilities;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListUtils {


    public static <T extends Comparable<T>> T getMin(List<T> list){
        if (list.size() <= 0){
            throw new IllegalArgumentException();
        }
        T min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static <T extends Comparable<T>> T getMax(List<T> list){
        if (list.size() <= 0) throw new IllegalArgumentException();
        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max.compareTo(list.get(i)) < 0) {
                max = list.get(i);
            }
        }
        return max;
    }
}
