package pl.futurejava;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza.PizzaBuilder("Large")
                .withCheese()
                .withPepperoni()
                .withMushrooms()
                .build();

        System.out.println(pizza);
    }
}