package nl.suriani.dmexample.domain;

import nl.suriani.dmexample.domain.exception.EndDateBeforeStartDateException;

public interface DateGuards {
    static void isStartDateBeforeOrEqualToEndDate(StartDate startDate, EndDate endDate) {
        if (endDate.value().isBefore(startDate.value())) {
            throw new EndDateBeforeStartDateException();
        }
    }
}
