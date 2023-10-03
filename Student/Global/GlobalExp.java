package Student.Global;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import Student.Exception.AgeNotFoundException;

@RestControllerAdvice
public class GlobalExp {

	@ExceptionHandler(AgeNotFoundException.class)
	public ResponseEntity<Object> handeAge(AgeNotFoundException a){
		return new ResponseEntity<Object>("Please Enter Age Of Above 18",HttpStatus.BAD_REQUEST);
	}

}
