package nl.suriani.dmexample.domain.events;

import nl.suriani.dmexample.domain.agreement.AdministrationAgreementId;
import nl.suriani.dmexample.domain.shared.EndDate;
import nl.suriani.dmexample.domain.shared.DomainEvent;

import java.time.LocalDateTime;
import java.util.Optional;

public final class AdministrationAgreementEndDateChanged extends DomainEvent {
    private final AdministrationAgreementId administrationAgreementId;
    private final EndDate oldEndDate;
    private final EndDate newEndDate;

    public AdministrationAgreementEndDateChanged(LocalDateTime createdAt, AdministrationAgreementId administrationAgreementId, EndDate oldEndDate, EndDate newEndDate) {
        super(createdAt);
        this.administrationAgreementId = administrationAgreementId;
        this.oldEndDate = oldEndDate;
        this.newEndDate = newEndDate;
    }

    public AdministrationAgreementId getAdministrationAgreementId() {
        return administrationAgreementId;
    }

    public Optional<EndDate> oldEndDate() {
        return Optional.ofNullable(oldEndDate);
    }

    public Optional<EndDate> getNewEndDate() {
        return Optional.ofNullable(newEndDate);
    }
}
