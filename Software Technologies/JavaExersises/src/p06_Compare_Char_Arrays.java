import java.util.Arrays;
import java.util.Scanner;

public class p06_Compare_Char_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] firstArr = scanner.nextLine().replaceAll(" ", "").toCharArray();
        char[] secondArr =scanner.nextLine().replaceAll(" ", "").toCharArray();

        if (firstArr.length > secondArr.length)
        {
            boolean k = false;
            for (int i = 0; i < secondArr.length; i++)
            {

                if ((int)(firstArr[i]) > (int)(secondArr[i]) || k)
                {
                    k = true;
                    char holder = firstArr[i];
                    firstArr[i] = secondArr[i];
                    secondArr[i] = holder;
                }


            }

            printArray(firstArr, secondArr);

        }
        else
        {
            boolean k = false;
            for (int i = 0; i < firstArr.length; i++)
            {

                if ((int)(firstArr[i]) > (int)(secondArr[i]) || k)
                {
                    k = true;
                    char holder = firstArr[i];
                    firstArr[i] = secondArr[i];
                    secondArr[i] = holder;
                }


            }

            printArray(secondArr, firstArr);
        }
    }

    public static void printArray(char[] firstArr, char[] secondArr){

    String str = "";
            for (char c : secondArr) {
                str+= c;
    }
            System.out.println(str);
        str = "";
            for (char c : firstArr) {
                str+= c;
    }
            System.out.println(str);
    }
}
