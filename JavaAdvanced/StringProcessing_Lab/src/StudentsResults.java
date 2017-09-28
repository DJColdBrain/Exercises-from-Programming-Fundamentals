import java.util.Arrays;
import java.util.Scanner;

public class StudentsResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
         double[][] grades = new double[n][3];
        String[] names = new String [n];

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            scanner.next();

            names[i] = name;

            grades[i] = Arrays.stream(scanner.nextLine().split(", ")).mapToDouble(Double::parseDouble).toArray();



        }
        System.out.println(
                String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|",
                        "Name", "JAdv", "JavaOOP", "AdvOOP", "Average"));
        for (int i = 0; i < n; i++) {

            double average =
                    (grades[i][0] + grades[i][1] + grades[i][2]) / 3;
            System.out.println(
                    String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|",
                            names[i], grades[i][0], grades[i][1], grades[i][2],average));

        }

    }
}
