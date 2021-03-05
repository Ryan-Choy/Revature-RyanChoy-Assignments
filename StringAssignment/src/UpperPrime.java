import java.util.Scanner;
import java.util.Arrays;

public class UpperPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the statement.");
		String s = sc.nextLine();

		System.out.println("Turning characters at prime indexes into upper case...");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(i);
		}
		System.out.print("\n");
		for (int i = 0; i < s.length(); i++) {
			int c = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.print(Character.toUpperCase(s.charAt(i)));
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}

}
