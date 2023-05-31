package nl.suriani.dmexample.domain.shared;

import nl.suriani.dmexample.domain.shared.Guards;

import java.time.LocalDate;

public record StartDate(LocalDate value) {
    public StartDate {
        Guards.isNotNull(value);
    }
}
