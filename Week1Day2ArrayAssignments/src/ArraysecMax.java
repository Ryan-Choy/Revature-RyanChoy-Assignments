import java.util.Arrays;

public class ArraysecMax {
	public static void main(String[] args) {
		ArrayInput ai = new ArrayInput();
		int[] secma = ai.array();
		if (secma.length == 1) {
			System.out.println("There is 2nd maximum value.");
		} else {
			Arrays.sort(secma);
			int max = secma.length - 2;
			System.out.println("\nThe second highest number is: " + secma[max]);
		}

	}

}
