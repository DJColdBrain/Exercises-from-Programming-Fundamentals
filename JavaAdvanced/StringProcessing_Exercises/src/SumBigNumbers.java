import java.util.Arrays;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumber = scanner.nextLine();
        String secondNumber = scanner.nextLine();

        firstNumber = TrimStart(firstNumber, '0');
        secondNumber = TrimStart(secondNumber, '0');

        StringBuilder result = new StringBuilder();
        if (firstNumber.length() > secondNumber.length())
        {
            secondNumber = PadLeft(secondNumber, firstNumber, '0');
        }
        else if (firstNumber.length() < secondNumber.length())
        {
            firstNumber = PadLeft(firstNumber, secondNumber, '0');
        }
        char[] str1 = firstNumber.toCharArray();
        char[] str2 = secondNumber.toCharArray();

        int remainder = 0;
        int addition = 0;
        for (int i = str1.length - 1; i >= 0; i--)
        {
            int num1 = Integer.parseInt(String.valueOf(str1[i]));
            int num2 = Integer.parseInt(String.valueOf(str2[i]));
            num1 += addition;
            addition = 0;
            if (num1+num2<10)
            {
                result.append(num1 + num2);
            }
            else
            {
                remainder = ((num1 + num2) % 10);
                result.append(remainder);
                addition= ((num1 + num2) /10);
            }
        }
        if (addition!=0)
        {
            result.append(addition);
        }

        char[] endResult=result.reverse().toString().toCharArray();


        System.out.println(Arrays.toString(endResult).replaceAll("[\\[\\], ]", ""));

    }
    public static String PadLeft(String firstLength, String secondLength, char c){
        StringBuilder result = new StringBuilder();
        int length =  secondLength.length() - firstLength.length();

        for (int i = 0; i < length; i++) {
            result.append(c);
        }
        result.append(firstLength);
        return result.toString();
    }

    public  static String TrimStart(String s, char c){

        while (s.indexOf(c) == 0){
            s = s.substring(1);
        }
        return s;
    }
}
