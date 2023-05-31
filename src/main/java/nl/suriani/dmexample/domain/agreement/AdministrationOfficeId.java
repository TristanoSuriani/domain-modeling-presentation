package nl.suriani.dmexample.domain.agreement;

import nl.suriani.dmexample.domain.shared.Guards;

import java.util.UUID;

public record AdministrationOfficeId(UUID value) {
    public AdministrationOfficeId {
        Guards.isNotNull(value);
    }
}
