package nl.suriani.dmexample.domain;

import java.util.UUID;

public record AdministrationOfficeId(UUID value) {
    public AdministrationOfficeId {
        Guards.isNotNull(value);
    }
}
