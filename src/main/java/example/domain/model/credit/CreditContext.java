package example.domain.model.credit;

import example.domain.model.payment.PaymentHistory;

/**
 * 信用状態
 */
public class CreditContext {
    CreditPolicy creditPolicy;
    PaymentHistory paymentHistory;

    CreditStatus creditStatus() {
        return null;
    }
}
