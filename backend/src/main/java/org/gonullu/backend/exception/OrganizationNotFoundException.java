package org.gonullu.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class OrganizationNotFoundException extends RuntimeException {
    public OrganizationNotFoundException() {
        super();
    }

    public OrganizationNotFoundException(String message) {
        super(message);
    }

    public OrganizationNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
