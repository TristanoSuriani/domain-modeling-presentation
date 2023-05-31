package nl.suriani.dmexample.domain.agreement;

import java.time.LocalDate;
import java.util.List;

public class AdministrationAgreementAnemic {
    private String uuid;

    private String employerUuid;

    private String administrationOfficeUuid;

    private LocalDate startDate;

    private LocalDate endDate;

    private List<String> annotations;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getEmployerUuid() {
        return employerUuid;
    }

    public void setEmployerUuid(String employerUuid) {
        this.employerUuid = employerUuid;
    }

    public String getAdministrationOfficeUuid() {
        return administrationOfficeUuid;
    }

    public void setAdministrationOfficeUuid(String administrationOfficeUuid) {
        this.administrationOfficeUuid = administrationOfficeUuid;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<String> annotations) {
        this.annotations = annotations;
    }
}
