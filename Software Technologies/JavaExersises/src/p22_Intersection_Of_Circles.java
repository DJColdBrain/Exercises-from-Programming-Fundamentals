
import java.util.Arrays;
import java.util.Scanner;

public class p22_Intersection_Of_Circles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] paramehers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Circle circle1 = new Circle(paramehers[0], paramehers[1], paramehers[2]) ;
        paramehers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Circle circle2 = new Circle(paramehers[0], paramehers[1], paramehers[2]);

        if (AreCirclesCrosing(circle1, circle2))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }


    }


    private static boolean AreCirclesCrosing(Circle circle1, Circle circle2)
    {
        double x = Math.abs(circle1.getCordinateX() - circle2.getCordinateX());
        double y = Math.abs(circle1.getCordinateY() - circle2.getCordinateY());

        double d = Math.sqrt(x * x + y * y);

        if (d <= circle2.getRadius() + circle1.getRadius())
        {
            return true;
        }
        else
        {

            return false;
        }
    }
}

class Circle {
    private int cordinateX;
    private int cordinateY;
    private int radius;

    public Circle(int cordinateX, int cordinateY, int radius) {
        this.cordinateX = cordinateX;
        this.cordinateY = cordinateY;
        this.radius = radius;
    }

    public int getCordinateX() {
        return cordinateX;
    }

    public void setCordinateX(int cordinateX) {
        this.cordinateX = cordinateX;
    }

    public int getCordinateY() {
        return cordinateY;
    }

    public void setCordinateY(int cordinateY) {
        this.cordinateY = cordinateY;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

