package jarOfT;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<T> {

    Deque<T> emelents = new ArrayDeque<>();

    public void  add(T element){
        emelents.add(element);
    }

    public T remove(){
        return emelents.pollFirst();
    }
}
