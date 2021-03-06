package business;

public class InvalidDLNumber extends RuntimeException {
	
	public InvalidDLNumber() {
		super();
	}
	
	public InvalidDLNumber(String message) {
		super(message);
	}

}
//3)Create a BusinessException(unchecked) and use it for handling for invalid DL number.