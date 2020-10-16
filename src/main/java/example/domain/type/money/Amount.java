package example.domain.type.money;

/**
 * 金額
 */
public class Amount {
    long value;

    Amount(long value) {
        this.value = value;
    }

    public Amount add(Amount other) {
        return new Amount(value + other.value);
    }
}