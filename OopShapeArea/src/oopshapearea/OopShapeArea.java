package oopshapearea;

import oopshapearea.area.Circle;
import oopshapearea.area.Rectangle;
import oopshapearea.area.Triangle;

public class OopShapeArea {

    public static void main(String[] args) {

        Circle c = new Circle(5.5);
        Rectangle r = new Rectangle(6, 8.5);
        Triangle t = new Triangle(5.5, 3);
        
        
        System.out.println("Area of Circle: "+c.area());
        System.out.println("Area of Rectangle: "+r.area());
        System.out.println("Area of Triangle: "+t.area());
        
        
        
    }

}
