package pl.futurejavacode.oopExercises;

import java.util.Objects;

public class Rectangle2 {
    private Object sideSizeA;
    private Object sideSizeB;

    public Rectangle2(int sideSizeA, int sideSizeB) {
        this.sideSizeA = sideSizeA;
        this.sideSizeB = sideSizeB;
    }

    public Rectangle2(double sideSizeA, double sideSizeB) {
        this.sideSizeA = sideSizeA;
        this.sideSizeB = sideSizeB;
    }

    public Rectangle2(int sideSizeA) {
        this.sideSizeA = sideSizeA;
    }

    public Rectangle2(double sideSizeA) {
        this.sideSizeA = sideSizeA;
    }

    public boolean isSquare() {
        if (this.sideSizeB == null) {
            return true;
        } else {
            return this.sideSizeA.equals(this.sideSizeB);
        }
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Rectangle2 that = (Rectangle2) o;
//        return Objects.equals(Double.valueOf(sideSizeA), Double.valueOf(that.sideSizeA)) && Objects.equals(Double.valueOf(sideSizeB), Double.valueOf(that.sideSizeB));
//    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(sideSizeA);
        result = 31 * result + Objects.hashCode(sideSizeB);
        return result;
    }
}
