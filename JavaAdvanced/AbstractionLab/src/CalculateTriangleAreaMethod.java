import java.util.Scanner;

public class CalculateTriangleAreaMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        scanner.nextLine();

        double area = calculateTriangleArea(base, height);
        print(area);

    }



    public static double calculateTriangleArea(double base, double height){
        double area = (base * height) /2;

        return area;
    }

    public  static  void  print(double area){
        System.out.printf("Area = %.2f", area);
    }
}
