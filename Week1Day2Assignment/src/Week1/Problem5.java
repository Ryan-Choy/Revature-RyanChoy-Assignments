package Week1;

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		// modify one of the problems to include user input
		Scanner scan = new Scanner(System.in);
		boolean on = true;

		// while loop is for returning to the start in case of user inputting an invalid
		// number range
		while (on == true) {
			// user input
			System.out.println("Enter the first number of the range.");
			int start = Integer.parseInt(scan.nextLine());
			System.out.println("\n Enter the last number of the range.");
			int end = Integer.parseInt(scan.nextLine());

			// for invalid cases
			if (end <= start) {
				System.out.println("Number range is invalid, please enter a valid range.");
			} else {
				// code that takes the inputed values
				System.out.println("\n The odd numbers of the range are:");
				for (int i = start; i <= end; i++) {
					if (i % 2 == 1) {
						System.out.print(i + " ");
					}
				}
				// exit the loop
				on = false;
			}
		}
		// close scanner
		scan.close();
	}

}
