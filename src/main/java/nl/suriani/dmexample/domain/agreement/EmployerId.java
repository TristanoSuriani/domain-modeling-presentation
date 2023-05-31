package nl.suriani.dmexample.domain.agreement;

import nl.suriani.dmexample.domain.shared.Guards;

import java.util.UUID;

public record EmployerId(UUID value) {
    public EmployerId {
        Guards.isNotNull(value);
    }
}
