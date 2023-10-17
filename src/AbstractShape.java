import example.client.Configuration;

public abstract class AbstractShape implements ShapeInterface {

    public String name;


    public AbstractShape(String name) {
        this.name = name;
    }

    public void printShapeName() {
        System.out.println(this.name);
    }

    public void configure(Configuration configuration) {
        // some logic that configures class

    }
}
