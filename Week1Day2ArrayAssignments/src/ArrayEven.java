import java.util.Scanner;

public class ArrayEven {
	public static void main(String[] args) {
		ArrayInput ai = new ArrayInput();
		int[] es = ai.array();
		int esum = 0;


		for (int i = 0; i < es.length; i++) {
			if (es[i] % 2 == 0) {
				esum = esum + es[i];
			}
		}
		if (esum == 0) {
			System.out.println("There are no even numbers in the array.");
		} else {
			System.out.println("The palindrome numbers are: ");
			System.out.println(esum);
		}

	}

}
