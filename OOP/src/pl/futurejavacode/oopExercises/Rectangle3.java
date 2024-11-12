package pl.futurejavacode.oopExercises;

public class Rectangle3 {
    private double length;
    private double width;

    public Rectangle3(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle3(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle3(double length) {
        this.length = length;
        this.width = length;
    }

    public Rectangle3(int length) {
        this.length = length;
        this.width = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public boolean isSquare() {
        return this.width == this.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle3 that = (Rectangle3) o;
        return (Double.compare(length, that.length) == 0 && Double.compare(width, that.width) == 0) || (Double.compare(length, that.width) == 0 && Double.compare(width, that.length) == 0);
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(length);
        result = 31 * result + Double.hashCode(width);
        return result;
    }
}
