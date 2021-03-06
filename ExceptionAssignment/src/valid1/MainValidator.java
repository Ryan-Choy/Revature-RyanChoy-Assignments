package valid1;

public class MainValidator {
	public static void main(String[] args) {

		Logic vl = new Logic();

		try {
			if (vl.isAgeValid(15)) {
				System.out.println("Age validated.");
			}
		} catch (AgeInvalid e) {
			System.out.println(e.getMessage());
		}

		try {
			if (vl.isContactValid("+1-1234567891")) {
				System.out.println("Valid number.");
			}
		} catch (ContactInvalid e) {
			System.out.println(e.getMessage());
		}
	}

}
//Assignment Exception
//1)Try to recreate the same
//2)Create a BusinessException(checked) and use it for handling for InvalidPassportNumber
//3)Create a BusinessException(unchecked) and use it for handling for invalid DL number.