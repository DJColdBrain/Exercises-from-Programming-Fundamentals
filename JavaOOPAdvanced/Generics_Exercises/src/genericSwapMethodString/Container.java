package genericSwapMethodString;

import java.util.ArrayList;
import java.util.List;

public class Container<T> {

    private List<T> items;

    public Container() {
        this.items = new ArrayList<>();
    }

    public void add(T item){
        this.items.add(item);
    }

    public void swap(int pos1, int pos2){
       // try {
        if (pos1 == pos2){
            return;
        }
            int min = Math.min(pos1, pos2);
            int max = Math.max(pos1, pos2);
            T temp = items.get(max);
            items.remove(max);
            items.add(max, items.get(min));
            items.remove(min);
            items.add(min, temp);
     //   }catch (IndexOutOfBoundsException e){

      //  }

    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (T item : items) {
            s.append(String.format("%s: %s%n", item.getClass().getName(), item));
        }
        return s.toString();
    }

}
