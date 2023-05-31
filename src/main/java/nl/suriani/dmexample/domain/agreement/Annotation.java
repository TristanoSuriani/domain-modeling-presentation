package nl.suriani.dmexample.domain.agreement;

import nl.suriani.dmexample.domain.shared.Guards;

public record Annotation(String value) {
    public Annotation {
        Guards.isNotNull(value);
        Guards.isNotEmpty(value);
    }
}
