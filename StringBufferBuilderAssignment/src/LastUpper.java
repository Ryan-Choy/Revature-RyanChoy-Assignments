
public class LastUpper {
	public static void main(String[] args) {
		String last = "The quick brown fox jumps over the lazy dog";
		System.out.println("Input: " + last);

		String ar[] = last.split(" ");

		StringBuilder bup = new StringBuilder();

		for (int i = 0; i < ar.length; i++) {

			bup.append(ar[i].substring(0, ar[i].length() - 1))
					.append(Character.toUpperCase(ar[i].charAt(ar[i].length() - 1))).append(" ");
		}

		System.out.println(bup.toString().trim());

	}

}
//Assignments - String,StringBuffer,StringBuilder
//1)Take a sentence as input and convert all the last chars to upper case of every word
//2)Take a sentence as input and for the word with length odd convert the middle character to uppercase and for the word length even convert the
//first character to uppercase.
//3)Take a sentence as input and print the word with maximum letters and also print the word with minimum letters.