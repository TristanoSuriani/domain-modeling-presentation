package nl.suriani.dmexample.domain;

import java.time.LocalDate;
import java.util.UUID;

public record StartDate(LocalDate value) {
    public StartDate {
        Guards.isNotNull(value);
    }
}
