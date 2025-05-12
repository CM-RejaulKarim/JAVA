package polymorphismwitharray;

import polymorphismwitharray.areaclass.Circle;
import polymorphismwitharray.areaclass.Rectangle;
import polymorphismwitharray.areaclass.Shape;
import polymorphismwitharray.areaclass.Triangle;

public class PolymorphismWithArray {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(6);
        shapes[1] = new Rectangle(5, 7);
        shapes[2] = new Triangle(4, 6);
        shapes[3] = new Triangle(4, 6);

        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }

    }

}
