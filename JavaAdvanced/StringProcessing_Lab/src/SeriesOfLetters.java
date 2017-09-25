import java.util.Scanner;

public class SeriesOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] s = scanner.nextLine().toCharArray();

        int state = 0;
        int index = 0;
        char prev = ' ';
        StringBuilder sb = new StringBuilder();
        while (index <= s.length){
            switch (state){
                case 0:
                    prev = s[index];
                    state = 1;
                    break;
                case 1:
                    if (index == s.length){
                        sb.append(s[index-1]);
                        break;
                    }

                    if (prev == s[index]){
                        state = 2;
                    }
                    sb.append(s[index -1 ]);
                    prev = s[index];
                    break;
                case 2:
                    if (index == s.length){
                        break;
                    }
                    if (s[index] != prev){
                        state =1;
                    }
                    prev = s[index];
                    break;
            }
            index++;
        }
        System.out.println(sb.toString());
    }
}
