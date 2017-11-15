package ClassBox;

public class Box {

    private double lenght;
    private double width;
    private double height;

    Box(double lenght, double width, double height) {
        this.height = height;
        this.lenght = lenght;
        this.width = width;
    }

    Double calculateSurfaceArea() {
        return (this.lenght * this.width * 2) + (2 * this.lenght * this.height) + (2 * this.height * this.width);
    }

    Double calculateLateralSurfaceArea() {
        return (this.lenght * this.height * 2 )+( 2 * this.width * this.height);
    }

    Double calculateVolume() {
        return this.lenght * this.width * this.height;
    }

}
