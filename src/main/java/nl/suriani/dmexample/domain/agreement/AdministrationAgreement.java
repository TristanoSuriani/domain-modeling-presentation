package nl.suriani.dmexample.domain.agreement;

import nl.suriani.dmexample.domain.shared.DateGuards;
import nl.suriani.dmexample.domain.shared.EndDate;
import nl.suriani.dmexample.domain.shared.Guards;
import nl.suriani.dmexample.domain.shared.StartDate;

import java.util.List;
import java.util.Optional;


public record AdministrationAgreement(AdministrationAgreementId id,
                                      EmployerId employerId,
                                      AdministrationOfficeId administrationOfficeId,
                                      StartDate startDate,
                                      Optional<EndDate> endDate,
                                      List<Annotation> annotations) {


    public AdministrationAgreement {
        Guards.isNotNull(id);
        Guards.isNotNull(employerId);
        Guards.isNotNull(administrationOfficeId);
        Guards.isNotNull(startDate);
        Guards.isNotNull(endDate);
        Guards.isNotNull(annotations);
        annotations = List.copyOf(annotations);

        endDate.ifPresent(date -> DateGuards.isStartDateBeforeOrEqualToEndDate(startDate, date));
    }

    public AdministrationAgreement withEndDate(Optional<EndDate> endDate) {
        return new AdministrationAgreement(id,
                employerId,
                administrationOfficeId,
                startDate,
                endDate,
                annotations);
    }
}
