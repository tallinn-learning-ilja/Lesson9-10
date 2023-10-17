
import example.client.Configuration;
import example.client.impletation.AccountClient;
import example.client.impletation.UserClient;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ShapeInterface square = new Square(2);
        ShapeInterface rectangle = new Rectangle(3, 5);
        ShapeInterface circle = new Circle(4);

        List<ShapeInterface> list = new ArrayList<>();
        list.add(square);
        list.add(rectangle);
        list.add(circle);

        Main main = new Main();

        System.out.println(main.sumAllAreas(list));
    }

    public double sumAllAreas(List<ShapeInterface> shapes) {
        double result = 0;
        for (ShapeInterface shape : shapes) {
            result += shape.calculateArea();
        }
        return result;
    }
}
