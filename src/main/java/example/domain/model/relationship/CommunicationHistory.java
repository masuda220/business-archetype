package example.domain.model.relationship;

import example.domain.model.customer.Customer;

import java.util.Set;

/**
 * コミュニケーション履歴
 */
public class CommunicationHistory {
    Customer customer;
    Set<CommunicationThread> communicationThreads;
}
