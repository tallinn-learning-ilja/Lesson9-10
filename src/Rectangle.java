public class Rectangle extends AbstractShape  {

    private double width;
    private double height;

    public Rectangle() {
        super("Rectangle");
    }

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void printShapeInfo() {
        System.out.println("Rectangle area: " + calculateArea());
        System.out.println("Rectangle perimeter: " + calculatePerimeter());
    }
}
