import java.util.Arrays;

public class MinMaxWord {

	public static void main(String[] args) {
		String mima = "The quicker brown fox jumps over a lazy dog";
		System.out.println("Input: " + mima);
		String ar[] = mima.split(" ");
		String max = ar[0];
		String min = ar[0];

		for (int i = 1; i < ar.length; i++) {
			if (max.length() > ar[i].length()) {

			} else {
				max = ar[i];
			}
			if (min.length() < ar[i].length()) {

			} else {
				min = ar[i];
			}

		}
		System.out.println("The word with the most amount of letters is: " + max
				+ "\nThe word with the least amount of letters is: " + min);
	}

}
//3)Take a sentence as input and print the word with maximum letters and also print the word with minimum letters.
