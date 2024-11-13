package pl.futurejavacode.oopExercises.figures2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getRadius());
        System.out.println(circle.calculateArea());
        System.out.println(circle.getType());
        System.out.println();

        Rectangle rectangle = new Rectangle(5);
        System.out.println(rectangle.getDimension1());
        System.out.println(rectangle.getDimension2());
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.getType());
        System.out.println();

        Triangle triangle = new Triangle(5);
        System.out.println(triangle.getBasis());
        System.out.println(triangle.getHeight());
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.getType());
    }
}
