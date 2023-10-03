package Electronic.global;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import Electronic.ColorException.ColorException;
import Electronic.Exception.BrandandPriceNotFoundException;
import Electronic.Exception.modelNotFoundException;
import Electronic.PriceExc.PriceNotFoundException;
import Electronic.UpdateException.UpdationError;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(PriceNotFoundException.class)
	public ResponseEntity<Object> handePrice(PriceNotFoundException p){
		return new ResponseEntity<Object>("Please Enter Valid price",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(modelNotFoundException.class)
	public ResponseEntity<Object> handemodel(modelNotFoundException p){
		return new ResponseEntity<Object>("Please Enter Valid Model",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(ColorException.class)
	public ResponseEntity<Object> handecolor(ColorException p){
		return new ResponseEntity<Object>("Please Enter Valid Color",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<Object> handecolor(NoSuchElementException p){
		return new ResponseEntity<Object>("Please Enter Valid ID",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(BrandandPriceNotFoundException.class)
	public ResponseEntity<Object> handecolor(BrandandPriceNotFoundException p){
		return new ResponseEntity<Object>("Please Enter Brand and price Correctly",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(UpdationError.class)
	public ResponseEntity<Object> handecolor(UpdationError p){
		return new ResponseEntity<Object>("Please Enter the Correct brand and Update",HttpStatus.BAD_REQUEST);
	}

}
