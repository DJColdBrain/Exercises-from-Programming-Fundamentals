package shapes;

public abstract class Shape {

    private double perimeter;
    private double area;

    public final double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public final double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    protected abstract void calculatePerimeter();

    protected abstract void calculateArea();
}
