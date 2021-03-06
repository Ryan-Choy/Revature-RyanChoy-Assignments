package business;

public class BusinessLogic {

	public boolean isPassportValid(String pass) throws InvalidPassportNumber {
		if (!pass.matches("\\[0-9]{9}")) {
			throw new InvalidPassportNumber("Passport number: " + pass + " is invalid.");
		}

		return true;
	}

	public boolean isDLValid(String dl) {

		if (!dl.matches("\\[0-9]{10}")) {
			throw new InvalidDLNumber("DL number: " + dl + " is invalid.");
		}

		return true;
	}

}
