package nl.suriani.dmexample.application.port;

import nl.suriani.dmexample.domain.agreement.AdministrationAgreement;

import java.util.Optional;

public interface AdministrationAgreementRepository {
    void save(AdministrationAgreement administrationAgreement);
    Optional<AdministrationAgreement> findById(String id);
}
