package pl.futurejavacode.oopExercises.figures;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangleEquilateral = new Rectangle(5);
        System.out.println(rectangleEquilateral.calculateArea());
        System.out.println(rectangleEquilateral.getType());
        System.out.println();

        Triangle triangleEquilateral = new Triangle(5);
        System.out.println(triangleEquilateral.calculateArea());
        System.out.println(triangleEquilateral.getType());
        System.out.println();

        Triangle triangle = new Triangle(5, 2);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.getType());
        System.out.println();

        Circle circle = new Circle(5);
        System.out.println(circle.calculateArea());
        System.out.println(circle.getType());
    }
}
