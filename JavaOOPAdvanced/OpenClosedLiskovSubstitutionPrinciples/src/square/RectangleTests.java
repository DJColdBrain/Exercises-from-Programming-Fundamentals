package square;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTests {
    @Test
    public void getSidesTest() {
        Rectangle rect = new Rectangle(5, 10);

        Assertions.assertEquals(5, rect.getWidth());
        Assertions.assertEquals(10, rect.getHeight());
    }

    @Test
    public void getAreaTest() {
        Rectangle rect = new Rectangle(10, 5);
        Assertions.assertEquals(50, rect.getArea());
    }

    @Test
    public void getSquareTest() {
        Square rect = new Square(10);
        Assertions.assertEquals(100, rect.getArea());
    }
}
