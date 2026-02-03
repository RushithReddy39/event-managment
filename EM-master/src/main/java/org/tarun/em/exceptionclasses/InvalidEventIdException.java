package org.tarun.em.exceptionclasses;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class InvalidEventIdException extends RuntimeException {

	private String message;

	@Override
	public String getMessage() {
		return this.message;
	}

}
