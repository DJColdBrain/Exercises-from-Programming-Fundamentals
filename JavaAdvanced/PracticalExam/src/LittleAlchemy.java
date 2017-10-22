import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class LittleAlchemy {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> table = new ArrayDeque<>();
        Deque<Integer> storage = new ArrayDeque<>();

        Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(e -> table.add(e));

        while (true) {

            String[] command = reader.readLine().split("\\s+");
            if(command[0].equals("Revision")){
                break;
            }
            int amount = Integer.parseInt(command[2]);
            switch (command[0]){
                case "Apply":

                    if (table.peekFirst() == null){
                        continue;
                    }

                    int stone = table.pollFirst();
                    for (int i = 0; i < amount; i++) {

                        stone--;
                        if (stone <= 0){
                            storage.offerFirst(stone);
                            if (table.peekFirst() == null){
                                break;
                            }
                            stone = table.pollFirst();
                        }else {
                            table.offerLast(stone);
                            stone = table.pollFirst();
                        }
                    }

                    if (stone >0){
                        table.offerFirst(stone);
                    }

//                    stone -= amount;
//                    if (stone > 0){
//                        table.offerLast(stone);
//                    }else{
//                        storage.offerFirst(stone);
//                    }

                    break;
                case "Air":
                    if (storage.peekFirst() == null){
                        continue;
                    }
                    storage.pollFirst();

                    int gold = amount;
                    table.offerLast(gold);
                    break;
            }


        }

        for (Integer integer : table) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println(storage.size());
    }
}
