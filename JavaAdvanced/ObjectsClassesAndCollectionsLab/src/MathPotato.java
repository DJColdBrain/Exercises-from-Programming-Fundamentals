import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class MathPotato {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, reader.readLine().split("\\s+"));
        int n = Integer.parseInt(reader.readLine());

        int count = 1;
        int cycle = 1;
        while (queue.size() > 1 ){
            for (int j = 1; j < n; j++) {
                queue.offerLast(queue.pollFirst());
            }

            if (!isPrime(cycle)){
                System.out.println("Removed "+queue.pollFirst());

            }else{
                System.out.println("Prime "+queue.peekFirst());

            }
            cycle++;
        }
        System.out.println("Last is " + queue.getFirst());
    }

    private static boolean isPrime(int number){
        for(int i=2;i<=number/2;i++)
        {
            int temp=number%i;
            if(temp==0)
            {
                return false;
            }
        }
        if (number == 1){
            return  false;
        }
        return true;
    }
}
