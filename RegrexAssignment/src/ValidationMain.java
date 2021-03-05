import java.util.Scanner;

public class ValidationMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean on = true;

		while (on == true) {

			System.out.println("Please enter a 9 digit passport number.");
			String pass = sc.nextLine();

			if (pass.matches("[0-9]{9}")) {
				System.out.println("Passport number validated");
				on = false;
			} else {
				System.out.println("The passport number is invalid");
			}
		}
		on = true;
		while (on == true) {

			System.out.println("Please enter a social security number in the format AAAA GG SSSS");
			String ssn = sc.nextLine();

			if (ssn.matches("[0-9]{4} [0-9]{2} [0-9]{4}")) {
				System.out.println("Social security number validated.");
				on = false;
			} else {
				System.out.println("The social security number is invalid.");
			}
		}

		on = true;

		while (on == true) {
			System.out.println("Please enter a 10 digit driver license number");
			String dl = sc.nextLine();
			
			if(dl.matches("[0-9]{10}")) {
				System.out.println("Driver license number validated.");
				on = false;
			} else {
				System.out.println("The driver license number is invalid.");
			}
		}
		sc.close();
	}

}
//Assignment Regex - 1)Write validation for passport number, SSN number, DL and any other ID if you have.