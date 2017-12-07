package extendsArrayListT;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.BiFunction;

public class ExtendedArrayList<T extends Comparable<T>> extends ArrayList<T>{

    public T min(){
        BiFunction<T, T, Boolean> function = (t, t1) -> t.compareTo(t1) > 0;
        return maxOrMin(function);
    }

    public T max(){
        BiFunction<T, T, Boolean> function = (t, t1) -> t.compareTo(t1) < 0;
        return maxOrMin(function);
    }

    private T maxOrMin(BiFunction<T,T,Boolean> function){
        T maxOrMin = null;
        Iterator<T> iterator = super.iterator();
        while (iterator.hasNext()){
            T nextElement = iterator.next();
            if (maxOrMin == null || function.apply(maxOrMin, nextElement)){
                maxOrMin = nextElement;
            }
        }
        return maxOrMin;
    }
}
