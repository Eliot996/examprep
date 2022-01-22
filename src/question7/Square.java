package question7;

public class Square implements Shape{
    double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return Math.pow(width, 2);
    }

    public double getWidth() {
        return width;
    }
}
