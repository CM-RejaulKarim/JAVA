package polymorphismwitharray.areaclass;

public class Triangle extends Area {

    private double height;
    private double base;

    public Triangle() {
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double area() {
        return (.5 * base * height);
    }

}
