public class Circle extends AbstractShape{

    private double radius;

    public Circle() {
        super("circle");
    }

    public Circle(double radius) {
        super("circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public void printShapeInfo() {

    }
}
