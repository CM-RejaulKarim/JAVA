package polymorphismwitharray.areaclass;

public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String area() {
        return "The Area of Circle: "+(Math.PI * Math.pow(radius, 2));
    }       //

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

}
