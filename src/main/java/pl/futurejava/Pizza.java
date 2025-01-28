package pl.futurejava;

public class Pizza {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;

   private Pizza(PizzaBuilder builder) {
       this.size = builder.size;
       this.cheese = builder.cheese;
       this.pepperoni = builder.pepperoni;
       this.mushrooms = builder.mushrooms;
    }

    @Override
    public String toString() {
        return "Pizza {" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", mushrooms=" + mushrooms +
                '}';
    }

    public static class PizzaBuilder {
        private String size;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;

        public PizzaBuilder(String size) {
            this.size = size;
        }

        public PizzaBuilder withCheese() {
            this.cheese = true;
            return this;
        }

        public PizzaBuilder withPepperoni() {
            this.pepperoni = true;
            return this;
        }

        public PizzaBuilder withMushrooms() {
            this.mushrooms = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
