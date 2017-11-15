package shapes;

public class Rectangle extends Shape {

    private double height;
    private double width;


    @Override
    protected void calculatePerimeter() {
        double perimeter = (2*height) + (2*width);
        setPerimeter(perimeter);
    }

    @Override
    protected void calculateArea() {
        double area = height * width;
        setPerimeter(area);
    }

    public final double getHeight() {
        return height;
    }

    public final double getWidth() {
        return width;
    }
}
