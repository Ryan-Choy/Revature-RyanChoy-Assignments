import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

	// switch cases
	// 2- range value
	// 1 - custom array


	public int[] array() {
		Scanner scu = new Scanner(System.in);
		boolean on = true;
		int[] arr = new int[3];

		while (on = true) {
			System.out.println("Press 1 to enter a custom array");
			System.out.println("Press 2 to enter a number range.");
			int opt = scu.nextInt();


			switch (opt) {

			case 1:
				System.out.println("Enter size of array");
				int a = scu.nextInt();
				System.out.println("Enter " + a + " elements");
				arr = new int[a];
				for (int i = 0; i < a; i++) {
					arr[i] = scu.nextInt();
				}
				/*
				 * System.out.println("The array is:");
				 * System.out.println(Arrays.toString(arr));
				 */
				scu.close();
				return arr;

			case 2:
				boolean onr = true;
				System.out.println("Enter the first number of the range.");
				int start = scu.nextInt();

				System.out.println("Enter the last number of the range.");
				int end = scu.nextInt();
				while (onr == true) {
					if (end <= start) {
						System.out.println("Number range is invalid, please enter a valid range.");
					} else {

						// create array
						arr = new int[end - start + 1];
						for (int i = 0; i < arr.length; i++) {
							arr[i] = start;
							start++;

						}
						/*
						 * System.out.println("The array is:");
						 * System.out.println(Arrays.toString(arr));
						 */
						scu.close();
						return arr;
					}
					onr = false;
				}

			default:
				System.out.println("Invalid input, please enter 1 for custom array or 2 for number range.");
				break;
			}
		}
		scu.close();
		return arr;
	}

}

/*
 * Assignment Arrays ----------------------- 
 * 1)Take an array input and find all
 * the prime numbers from it. 
 * 2)Take an array input and find all the palindrome
 * numbers from it. 
 * 3)Take an array input and find the sum of all even numbers.
 * 4)Take an array input and find the max value and min value from that array.
 * 5)Take an array input and find the 2nd max value in that array. 
 * 6)Perform CRUD operations on Array Note:Use the Arrays util class effectively
 */
