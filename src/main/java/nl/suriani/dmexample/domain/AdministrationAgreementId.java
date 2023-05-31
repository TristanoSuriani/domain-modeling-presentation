package nl.suriani.dmexample.domain;

import java.util.UUID;

public record AdministrationAgreementId(UUID value) {
    public AdministrationAgreementId {
        Guards.isNotNull(value);
    }
}
