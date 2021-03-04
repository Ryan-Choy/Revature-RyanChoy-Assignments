package Week1;

public class LoopOdd {
	// Problem 3: Find all the odd numbers between 100 and 199

	public static void main(String[] args) {

		System.out.println("The odd numbers are:");
		for (int i = 100; i <= 199; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}

}
