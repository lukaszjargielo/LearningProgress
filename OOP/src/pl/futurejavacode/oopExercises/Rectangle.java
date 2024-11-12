package pl.futurejavacode.oopExercises;

import java.util.Objects;

public class Rectangle {
    private String sideSizeA;
    private String sideSizeB;

    public Rectangle(int sideSizeA, int sideSizeB) {
        this.sideSizeA = String.valueOf(sideSizeA);
        this.sideSizeB = String.valueOf(sideSizeB);
    }

    public Rectangle(double sideSizeA, double sideSizeB) {
        this.sideSizeA = String.valueOf(sideSizeA);
        this.sideSizeB = String.valueOf(sideSizeB);
    }

    public Rectangle(int sideSizeA) {
        this.sideSizeA = String.valueOf(sideSizeA);
    }

    public Rectangle(double sideSizeA) {
        this.sideSizeA = String.valueOf(sideSizeA);
    }

    public String getSideSizeA() {
        return sideSizeA;
    }

    public void setSideSizeA(int sideSizeA) {
        this.sideSizeA = String.valueOf(sideSizeA);
    }

    public String getSideSizeB() {
        return sideSizeB;
    }

    public void setSideSizeB(int sideSizeB) {
        this.sideSizeB = String.valueOf(sideSizeB);
    }

    public boolean isSquare() {
        if (this.sideSizeB == null) {
            return true;
        } else {
            return this.sideSizeA.equals(this.sideSizeB);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(sideSizeA, rectangle.sideSizeA) && Objects.equals(sideSizeB, rectangle.sideSizeB);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(sideSizeA);
        result = 31 * result + Objects.hashCode(sideSizeB);
        return result;
    }
}
