import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Double> students = new TreeMap<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String name = reader.readLine();
            double[] grades = Arrays.stream(reader.readLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

            double averageGrade = 0;
            for (int j = 0; j < grades.length; j++) {
                averageGrade += grades[j];
            }
            averageGrade = averageGrade/grades.length;
            students.put(name, averageGrade);

        }

        for (Map.Entry<String, Double> entry : students.entrySet()) {
            System.out.println( entry.getKey() +" is graduated with " + entry.getValue());
        }
    }
}
