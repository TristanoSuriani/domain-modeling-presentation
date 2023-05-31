package nl.suriani.dmexample.domain.shared;

import nl.suriani.dmexample.domain.agreement.exception.EndDateBeforeStartDateException;

public interface DateGuards {
    static void isStartDateBeforeOrEqualToEndDate(StartDate startDate, EndDate endDate) {
        if (endDate.value().isBefore(startDate.value())) {
            throw new EndDateBeforeStartDateException();
        }
    }
}
