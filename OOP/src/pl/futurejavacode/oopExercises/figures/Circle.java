package pl.futurejavacode.oopExercises.figures;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getType() {
        return "circle";
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
