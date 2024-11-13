package pl.futurejavacode.oopExercises.figures2;

public class Triangle extends Shape {
    private double height;
    private double basis;

    public Triangle(Triangle ob) {
        this(ob.basis);
    }

    public Triangle(double basis) {
        this.basis = basis;
        this.height = Math.pow(basis, 2) * Math.sqrt(3) / 4;
    }

    public Triangle(double height, double basis) {
        this.height = height;
        this.basis = basis;
    }

    public double getHeight() {
        return height;
    }

    public double getBasis() {
        return basis;
    }

    @Override
    public double calculateArea() {
        return basis * height / 2;
    }
}
