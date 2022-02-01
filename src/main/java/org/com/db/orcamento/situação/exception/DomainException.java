package org.com.db.orcamento.situação.exception;

public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 2434137813010722445L;

    public DomainException(String s) {
        super(s);
    }

    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
