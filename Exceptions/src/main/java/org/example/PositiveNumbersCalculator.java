package org.example;

public class PositiveNumbersCalculator {
    public static int sum (int a, int b) {
        if(a <= 0 || b <= 0) {
            throw new NumberNotPositiveException("Only positive numbers!");
        }
        return a + b;
    }
}
