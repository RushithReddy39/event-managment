package org.tarun.em.exceptionhandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.tarun.em.exceptionclasses.NoEventFoundException;
import org.tarun.em.responsestructure.ResponseStructure;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	public ResponseStructure<String> runtimeExceptionHandler(RuntimeException e){
		ResponseStructure<String> rs = new ResponseStructure<String>();
		rs.setStatus(404);
		rs.setMessage("something seems wrong");
		rs.setBody(e.getMessage());
		return rs;
	}
	
	@ExceptionHandler(NoEventFoundException.class)
	public ResponseStructure<String> NoEventFoundExceptionHandler(NoEventFoundException e){
		ResponseStructure<String> rs = new ResponseStructure<String>();
		rs.setStatus(404);
		rs.setMessage("Something Went Wrong");
		rs.setBody(e.getMessage());
		return rs;
	}
	
	@ExceptionHandler(org.tarun.em.exceptionclasses.InvalidEventIdException.class)
	public ResponseStructure<String> InvalidEventIdException(org.tarun.em.exceptionclasses.InvalidEventIdException i){
		ResponseStructure<String> rs = new ResponseStructure<String>();
		rs.setStatus(404);
		rs.setMessage("Something Went Wrong");
		rs.setBody(i.getMessage());
		return rs;
	}
}
