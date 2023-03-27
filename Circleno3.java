public class Circleno3 extends Shape {
    private double radius;

    public Circleno3() {
        this.radius = 1.0;
    }

    public Circleno3(double radius) {
        this.radius = radius;
    }

    public Circleno3(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle dengan radius=" + radius + ", merupakan subclass dari " + super.toString();
    }
}