package nl.suriani.dmexample.domain.agreement;

import nl.suriani.dmexample.domain.events.AdministrationAgreementEndDateChanged;
import nl.suriani.dmexample.domain.shared.EndDate;
import nl.suriani.dmexample.domain.shared.EventPublisher;

import java.time.LocalDateTime;
import java.util.Optional;

public class AdministrationAgreementService {
    private EventPublisher eventPublisher;

    public AdministrationAgreement changeEndDate(AdministrationAgreement administrationAgreement, EndDate endDate) {
        var maybeEndDate = Optional.ofNullable(endDate);
        var newAdministrationAgreement = administrationAgreement.withEndDate(maybeEndDate);
        var event = new AdministrationAgreementEndDateChanged(LocalDateTime.now(),
                administrationAgreement.id(),
                administrationAgreement.endDate().orElse(null),
                maybeEndDate.orElse(null));

        eventPublisher.publish(event);
        return newAdministrationAgreement;
    }
}
