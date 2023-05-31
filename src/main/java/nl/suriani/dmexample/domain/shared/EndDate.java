package nl.suriani.dmexample.domain.shared;

import nl.suriani.dmexample.domain.shared.Guards;

import java.time.LocalDate;

public record EndDate(LocalDate value) {
    public EndDate {
        Guards.isNotNull(value);
    }
}
