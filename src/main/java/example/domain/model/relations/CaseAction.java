package example.domain.model.relations;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 対応
 */
public class CaseAction {
    CaseActionType actionType;
    LocalDate date;
    LocalTime time;
    String note;
}
