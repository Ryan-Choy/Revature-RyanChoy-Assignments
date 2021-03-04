import java.util.Arrays;

public class ArrayMinMax {
	public static void main(String[] args) {
		ArrayInput ai = new ArrayInput();
		int[] mima = ai.array();
		if (mima.length == 1) {
			System.out.println("There is no minimum or maximum value.");
		} else {
			Arrays.sort(mima);
			int max = mima.length - 1;
			System.out.println("The minimum number is: " + mima[0]);
			System.out.println("\nThe maximum number is: " + mima[max]);
		}

	}

}
