import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vowcount = 0;

		System.out.println("Please enter a statement.");
		String s1 = sc.nextLine();
		char[] vow = s1.toCharArray();

		System.out.println("Counting vowels...");

		for (int i = 0; i < vow.length; i++) {
			char cha = vow[i];

			switch (cha) {
			case 'a':
				vowcount += 1;
				break;
			case 'e':
				vowcount += 1;
				break;
			case 'i':
				vowcount += 1;
				break;
			case 'o':
				vowcount += 1;
				break;
			case 'u':
				vowcount += 1;
				break;
			case 'A':
				vowcount += 1;
				break;
			case 'E':
				vowcount += 1;
				break;
			case 'I':
				vowcount += 1;
				break;
			case 'O':
				vowcount += 1;
				break;
			case 'U':
				vowcount += 1;
				break;

			default:
				break;

			}
		}

		if (vowcount == 0) {
			System.out.println("There are no vowels in the statement.");
		} else {
			System.out.println("The number of vowels is: " + vowcount);
		}
	}

}
/*
 * Assignment String - 1)Take a string input from user and find the count of
 * vowels(aeiouAEIOU) in it. 2)Take a string input and print true if all vowels
 * are present in it else print false. aHedafioullooo - true aHedafiollooo -
 * false 3)Take a string input and print the characters at prime index to
 * uppercase.
 */