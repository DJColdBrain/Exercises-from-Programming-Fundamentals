import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class MatchingBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '('){
                stack.push(i);
            }else if (ch == ')'){
                System.out.println(s.substring(stack.pollFirst(), i+1));
            }

        }

    }
}
