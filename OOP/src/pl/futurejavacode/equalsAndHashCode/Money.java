package pl.futurejavacode.equalsAndHashCode;

import java.util.Objects;

public class Money {
    private int value;
    private String currency;

    public Money(int value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money money)) return false;

        return value == money.value && Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + Objects.hashCode(currency);
        return result;
    }
}
