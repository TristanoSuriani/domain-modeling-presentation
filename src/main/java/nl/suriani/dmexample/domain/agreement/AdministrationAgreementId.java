package nl.suriani.dmexample.domain.agreement;

import nl.suriani.dmexample.domain.shared.Guards;

import java.util.UUID;

public record AdministrationAgreementId(UUID value) {
    public AdministrationAgreementId {
        Guards.isNotNull(value);
    }
}
