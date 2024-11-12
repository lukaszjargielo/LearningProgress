package pl.futurejavacode.oopExercises.figures;

public class Triangle implements Shape{
private double basis;
private double sideA;
private double sideB;
private double height;

    public Triangle(double basis) {
        this.basis = basis;
        this.sideA = basis;
        this.sideB = basis;
        this.height = (Math.sqrt(3)/2)*basis;
    }

    public Triangle(double basis, double height) {
        this.basis = basis;
        this.height = height;
    }

    public double getBasis() {
        return basis;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String getType() {
        return "triangle";
    }

    @Override
    public double calculateArea() {
        return basis * height / 2;
    }


//    @Override
//    public double calculateArea() {
//        return this.basis * this.basis  * Math.sqrt(3) / 4;
//    }

    public double calculateArea(double a, double h) {
        return a * h / 2;
    }
}
