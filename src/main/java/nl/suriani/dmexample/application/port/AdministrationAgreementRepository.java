package nl.suriani.dmexample.application.port;

import nl.suriani.dmexample.domain.AdministrationAgreement;

public interface AdministrationAgreementRepository {
    void save(AdministrationAgreement administrationAgreement);
}
