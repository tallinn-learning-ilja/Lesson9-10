public class Square extends AbstractShape {

    private double sideLength;

    public Square() {
        super("Square");
    }

    public Square(double sideLength) {
        super("Square");
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * this.sideLength;
    }

    @Override
    public void printShapeInfo() {
        System.out.println("Square area: " + calculateArea());
        System.out.println("Square perimeter: " + calculatePerimeter());
    }
}
