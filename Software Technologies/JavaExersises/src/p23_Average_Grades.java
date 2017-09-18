import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p23_Average_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++)
        {
            String[] student = scanner.nextLine().split(" ");
            String name = student[0];
            double[] grades = new double[student.length-1];
            for (int j = 1; j < student.length ; j++)
            {
                grades[j-1] = Double.parseDouble(student[j]);
            }
            Student person = new Student(name, grades);
            students.add(person);
        }
        ArrayList<Student> smartStudents = new ArrayList<>();
        students.stream().filter(e -> e.getAverage() >= 5).sorted(Comparator.comparing(Student::getName)
                .thenComparing((a, b ) -> Double.compare(b.getAverage(), a.getAverage()))).forEach(smartStudents::add);
        for (Student student : smartStudents) {
            System.out.printf("%s -> %.2f%n", student.getName(), student.getAverage());
        }

    }
}

class Student
{

    public String name;
    public double[] grades;
    public double average ;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;

        this.average = 0;
        for (double grade : grades) {
            average += grade;
        }
        average = average/ grades.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double getAverage() {

        return average;
    }
}

