import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;

public class HotPotato {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, reader.readLine().split("\\s+"));
        int n = Integer.parseInt(reader.readLine());

        int count = 1;
        while (queue.size() > 1 ){
            if (count == n){
                System.out.println("Removed "+queue.pollFirst());
                count = 1;
                continue;
            }
            queue.offerLast(queue.pollFirst());

            count++;

        }
        System.out.println("Last is " + queue.getFirst());
    }
}
