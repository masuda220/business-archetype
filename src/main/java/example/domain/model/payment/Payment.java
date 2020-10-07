package example.domain.model.payment;

import example.domain.model.contract.Contract;
import example.domain.type.money.Amount;

import java.time.LocalDate;

/**
 * 支払い
 */
public class Payment {
    Amount amount;
    LocalDate date;
}
