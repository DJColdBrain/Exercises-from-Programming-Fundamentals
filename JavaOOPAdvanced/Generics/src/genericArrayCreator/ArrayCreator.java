package genericArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator<T> {



    public static <T> T[] create(int lenght, T item) {
        T[] array = (T[]) new Object[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = item;
        }
        return array;
    }

    public static <T> T[] create(Class<T> tClass, int lenght, T item){
        T[] array = (T[]) Array.newInstance(tClass, lenght);
        for (int i = 0; i < lenght; i++) {
            array[i] = item;
        }
        return array;
    }
}
