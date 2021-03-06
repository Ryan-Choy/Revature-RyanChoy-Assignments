package business;

public class MainBusiness {
	public static void main(String[] args) {

		BusinessLogic bl = new BusinessLogic();

		try {

			if (!bl.isPassportValid("1234567891")) {
				System.out.println("Passport validated.");
			}
		} catch (InvalidPassportNumber e) {
			System.out.println(e.getMessage());
		}

		try {
			if (!bl.isDLValid("1")) {
				System.out.println("DL validated.");
			}
		} catch (InvalidDLNumber e) {
			System.out.println(e.getMessage());
		}
	}

}
