import java.util.Arrays;
import java.util.Scanner;

public class ByteParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.nextLine();
        while (true){
            String comands = scanner.nextLine();
            if (comands.equals("party over")){
                break;
            }
            int[] cmd = Arrays.stream(comands.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int comand = cmd[0];
            int possition = cmd[1];
            if (comand == 0) {
                int mask = ~(1 << possition);
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = mask & numbers[i];
                }

            }else if (comand == 1){
                int mask = 1<< possition;
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = mask | numbers[i];
                }
            }else if (comand == -1 ){
                for (int i = 0; i < numbers.length; i++) {
                    int mask  = numbers[i]>>possition;
                    int bit = mask & 1;
                    if ( bit == 1){
                        mask = ~(1 << possition);
                        numbers[i] = mask & numbers[i];
                    }else{

                        mask = 1<< possition;
                        numbers[i] = mask | numbers[i];
                    }
                }
            }
        }
        for (int i : numbers) {
            System.out.println(i);
        }

    }
}
