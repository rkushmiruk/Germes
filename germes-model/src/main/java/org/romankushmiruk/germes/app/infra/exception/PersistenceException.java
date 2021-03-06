package org.romankushmiruk.germes.app.infra.exception;

import org.romankushmiruk.germes.app.infra.exception.base.AppException;

/**
 * Signals about data access layer unexpected situations
 * @author RomanKushmiruk
 *
 */
public class PersistenceException extends AppException {

    private static final long serialVersionUID = -7889716045779735512L;

    public PersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersistenceException(String message) {
        super(message);
    }
}
