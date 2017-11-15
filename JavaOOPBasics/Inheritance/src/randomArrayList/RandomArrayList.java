package randomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {

    public Object getRandomElement() {
        int index = new Random().nextInt(super.size() - 1);
        Object obj = super.get(index);
        super.remove(index);
        return obj;
    }
}
