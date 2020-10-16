package example.domain.type.money;

/**
 * 金額区分
 */
public enum AmountCategory {
    非課税(1, 1_000_000),
    軽減課税(1_000_001, Long.MAX_VALUE);

    AmountRange 金額帯;

    AmountCategory(long 下限, long 上限) {
        Amount 下限金額 = new Amount(下限);
        Amount 上限金額 = new Amount(上限);
        this.金額帯 = new AmountRange(下限金額, 上限金額);
    }

    public static AmountCategory from(Amount source) {
        for (AmountCategory each : AmountCategory.values()) {
            if (each.金額帯.includes(source)) return each;
        }
        throw new IllegalArgumentException("不一致");
    }
}
