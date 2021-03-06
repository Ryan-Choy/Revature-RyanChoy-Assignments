import java.util.Arrays;
import java.util.Scanner;

public class TrueVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;

		System.out.println("Please enter a statement.");
		String s = sc.nextLine();
		char[] vow = s.toCharArray();

		System.out.println("Checking the statement for all vowels...");

		for (int j = 0; j < vow.length; j++) {
			char cha = vow[j];

			switch (cha) {
			case 'a':
				a += 1;
				break;
			case 'e':
				e += 1;
				break;
			case 'i':
				i += 1;
				break;
			case 'o':
				o += 1;
				break;
			case 'u':
				u += 1;
				break;
			case 'A':
				a += 1;
				break;
			case 'E':
				e += 1;
				break;
			case 'I':
				i += 1;
				break;
			case 'O':
				o += 1;
				break;
			case 'U':
				u += 1;
				break;

			default:
				break;

			}
		}

		System.out.print("The statement has all vowels: ");
		if (a >= 1 && e >= 1 && i >= 1 && o >= 1 && u >= 1) {
			System.out.print(true);
		} else {
			System.out.print(false);
		}
	}

}
