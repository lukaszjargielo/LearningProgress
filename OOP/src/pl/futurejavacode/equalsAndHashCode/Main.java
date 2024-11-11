package pl.futurejavacode.equalsAndHashCode;

public class Main {
    public static void main(String[] args) {
        Money money1 = new Money(20, "PLN");
        Money money2 = new Money(20, "PLN");

        System.out.println(money1.getClass());

        System.out.println(money1.equals(money2));
    }
}
