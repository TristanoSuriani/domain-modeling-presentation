package nl.suriani.dmexample.domain.shared;

import nl.suriani.dmexample.domain.agreement.exception.MissingRequiredValueException;

public interface Guards {
    static void isNotNull(Object value) {
        if (value == null) {
            throw new MissingRequiredValueException();
        }
    }

    static void isNotEmpty(String value) {
        if (value.isEmpty()) {
            throw new MissingRequiredValueException();
        }
    }
}
