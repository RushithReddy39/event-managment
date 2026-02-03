package org.tarun.em.exceptionclasses;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class NoEventFoundException extends RuntimeException {

	private String message;
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
}
