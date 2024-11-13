package pl.futurejavacode.oopExercises.figures2;

public class Rectangle extends Shape {
    private double dimension1;
    private double dimension2;

    public Rectangle(Rectangle ob) {
        this(ob.dimension1, ob.dimension2);
    }

    public Rectangle(double dimension1) {
        this.dimension1 = this.dimension2 = dimension1;
    }

    public Rectangle(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public double getDimension1() {
        return dimension1;
    }

    public double getDimension2() {
        return dimension2;
    }


    @Override
    public double calculateArea() {
        return dimension1 * dimension2;
    }
}
