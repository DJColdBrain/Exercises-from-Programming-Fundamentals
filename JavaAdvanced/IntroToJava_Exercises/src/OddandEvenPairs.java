import java.util.Arrays;
import java.util.Scanner;

public class OddandEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\W+")).mapToInt(Integer::parseInt).toArray();
        if (numbers.length % 2 == 0){
            int a = -1;
            int b;
            for (int i = 0; i < numbers.length; i++){


                if (i %2 ==0){
                    a = numbers[i];
                }else{
                    b = numbers[i];
                    if ((a %2 ==0 && b % 2 == 0 )){
                        System.out.printf("%d, %d -> both are even%n", a ,b);
                    }else if ((a %2 ==1 && b % 2 ==1 )){
                        System.out.printf("%d, %d -> both are odd%n",a ,b);
                    }else{
                        System.out.printf("%d, %d -> different%n",a ,b);
                    }
                }
            }
        }else{
            System.out.print("invalid length");
        }
    }
}
