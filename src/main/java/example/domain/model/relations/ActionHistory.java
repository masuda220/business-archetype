package example.domain.model.relations;

import example.domain.model.customer.Customer;

import java.util.List;

/**
 * 対応履歴
 */
public class ActionHistory {
    Customer customer;
    List<ActionCase> actions;
}
