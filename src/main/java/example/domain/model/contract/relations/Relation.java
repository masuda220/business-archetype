package example.domain.model.contract.relations;

import example.domain.model.contract.Contract;

/**
 * 契約間の関係
 */
public class Relation {
    RelationType relationType;
    Contract one;
    Contract another;
}
