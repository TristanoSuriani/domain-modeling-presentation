package nl.suriani.dmexample.domain;

import nl.suriani.dmexample.domain.exception.MissingRequiredValueException;

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
