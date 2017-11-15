package ClassBoxDataValidation;


public class Box {

    private double length;
    private double width;
    private double height;

    Box(double length, double width, double height) throws IllegalAccessException {
        setHeight(height);
        setLength(length);
        setWidth(width);
    }

    Double calculateSurfaceArea() {
        return (this.length * this.width * 2) + (2 * this.length * this.height) + (2 * this.height * this.width);
    }

    Double calculateLateralSurfaceArea() {
        return (this.length * this.height * 2 )+( 2 * this.width * this.height);
    }

    Double calculateVolume() {
        return this.length * this.width * this.height;
    }

    private void setLength(double length) throws IllegalAccessException {
        if (length <= 0){
            throw new IllegalAccessException("Length cannot be zero or negative.");
        }else{
            this.length = length;
        }
    }

    private void setWidth(double width) throws IllegalAccessException {
        if (width <= 0){
            throw new IllegalAccessException("Width cannot be zero or negative.");
        }else{
            this.width = width;
        }
    }

    private void setHeight(double height) throws IllegalAccessException {
        if (height <= 0){
            throw new IllegalAccessException("Height cannot be zero or negative.");
        }else{
            this.height = height;
        }
    }
}
