package nl.suriani.dmexample.domain;

import java.time.LocalDate;

public record EndDate(LocalDate value) {
    public EndDate {
        Guards.isNotNull(value);
    }
}
