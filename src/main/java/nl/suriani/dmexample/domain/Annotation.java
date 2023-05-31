package nl.suriani.dmexample.domain;

import java.time.LocalDate;

public record Annotation(String value) {
    public Annotation {
        Guards.isNotNull(value);
        Guards.isNotEmpty(value);
    }
}
