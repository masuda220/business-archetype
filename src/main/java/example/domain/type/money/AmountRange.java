package example.domain.type.money;

/**
 * 金額範囲
 */
public class AmountRange {
    Amount 下限 = new Amount(10_000);
    Amount 上限 = new Amount(1_000_000);

    AmountRange(Amount 下限, Amount 上限) {
        this.下限 = 下限;
        this.上限 = 上限;
    }

    public boolean includes(Amount other) {
        return false; // TODO
    }
}
