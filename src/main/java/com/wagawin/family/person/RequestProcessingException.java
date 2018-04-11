package com.wagawin.family.person;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class RequestProcessingException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public RequestProcessingException() {
		super();
	}

	public RequestProcessingException(String message, Throwable cause) {
		super(message, cause);
	}

	public RequestProcessingException(String message) {
		super(message);
	}

	public RequestProcessingException(Throwable cause) {
		super(cause);
	}
}
