public class Main2 {
    public static void main(String[] args) {
        // membuat objek Shape
        Shape shape = new Shape();
        shape.setColor("green");
        shape.setFilled(false);
        System.out.println("Shape:");
        System.out.println("Color: " + shape.getColor());
        System.out.println("Filled: " + shape.isFilled());
        System.out.println(shape.toString());

        // membuat objek Circle
        Circleno3 circleno3 = new Circleno3();
        circleno3.setColor("blue");
        circleno3.setFilled(true);
        circleno3.setRadius(5.0);
        System.out.println("\nCircle:");
        System.out.println("Color: " + circleno3.getColor());
        System.out.println("Filled: " + circleno3.isFilled());
        System.out.println("Radius: " + circleno3.getRadius());
        System.out.println("Area: " + circleno3.getArea());
        System.out.println("Perimeter: " + circleno3.getPerimeter());
        System.out.println(circleno3.toString());

        // membuat objek Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("red");
        rectangle.setFilled(true);
        rectangle.setWidth(4.0);
        rectangle.setLength(6.0);
        System.out.println("\nRectangle:");
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Filled: " + rectangle.isFilled());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println(rectangle.toString());

        // membuat objek Square
        Square square = new Square();
        square.setColor("yellow");
        square.setFilled(false);
        square.setWidth(5.0);
        System.out.println("\nSquare:");
        System.out.println("Color: " + square.getColor());
        System.out.println("Filled: " + square.isFilled());
        System.out.println("Width: " + square.getWidth());
        System.out.println("Length: " + square.getLength());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println(square.toString());
    }
}
