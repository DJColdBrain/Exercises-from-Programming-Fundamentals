package shapes;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
        calculateArea();
        calculatePerimeter();
    }

    public final double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected void calculatePerimeter() {
        double perimeter = Math.PI * 2 * this.radius;
        setPerimeter(perimeter);
    }

    @Override
    protected void calculateArea() {
        double area = Math.PI * this.radius * this.radius;
        setPerimeter(area);
    }
}
