package business;

public class InvalidPassportNumber extends Exception {
	
	public InvalidPassportNumber() {
		super();
	}
	
	public InvalidPassportNumber(String message) {
		super(message);
	}
	

}
//2)Create a BusinessException(checked) and use it for handling for InvalidPassportNumber