package genericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;

public class BoxCounting<T extends Comparable> {

    private List<T> list;
    private int count;

    BoxCounting(){
        this.list = new ArrayList<>();
        count= 0;
    }

    public void add(T item){
        list.add(item);
    }

    public int compareListTo(T other){
        for (T t : list) {
            if (t.compareTo(other)>0) {
                count++;
            }

        }
        return this.count;
    }


}
