package pl.futurejavacode.oopExercises.figures;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length) {
        this.width = length;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String getType() {
        return "rectangle";
    }

    @Override
    public double calculateArea() {
        double width = length;
        return length * width;
    }


    public double calculateArea(double length, double width) {
        return length * width;
    }

}
