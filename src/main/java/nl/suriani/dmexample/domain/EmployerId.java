package nl.suriani.dmexample.domain;

import java.util.UUID;

public record EmployerId(UUID value) {
    public EmployerId {
        Guards.isNotNull(value);
    }
}
