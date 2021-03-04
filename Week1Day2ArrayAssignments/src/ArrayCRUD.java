import java.util.Scanner;
import java.util.Arrays;

public class ArrayCRUD {
	public static void main(String[] args) {

		Scanner scc = new Scanner(System.in);
		// create
		System.out.println("Enter size of array");
		int a = scc.nextInt();
		System.out.println("Enter " + a + " elements");
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = scc.nextInt();
		}

		// pointer to empty element or last element
		int n = Arrays.binarySearch(arr, 0);
		// for navigating the options
		boolean on = true;
		while (on == true) {

			System.out.println("Current Array: " + Arrays.toString(arr) + "\npointer is at index: " + n);

			System.out.println(
					"Enter the following keys to navigate the menu.\n1 - Add element\n2 - Delete element\n3 - Quit");
			int op = scc.nextInt();
			switch (op) {

			case 1: // add element
				System.out.println("Enter the value of the element you want to add.");
				int ele = scc.nextInt();
				System.out.println("Enter the value of the index where you want to place the element.");
				int pos = scc.nextInt();

				System.out.println("Updating...");
				for (int i = n; i > pos - 1; i--) {
					arr[i] = arr[i - 1]; // updating
				}
				System.out.println("Inserting...");
				arr[pos - 1] = ele; // inserting
				n++;
				break;

			case 2: // delete element

				System.out.println("Enter the index of the element that you want to remove.");
				int delpos = scc.nextInt();

				System.out.println("Deleting...");
				for (int i = delpos - 1; i < n; i++) {
					arr[i] = arr[i + 1];
				}
				n--;
				break;

			case 3: // quitting
				System.out.println("Quitting program...");
				on = false;
				break;

			default:
				System.out.println("Invalid input, please enter: 1 - add element, 2 - delete element, 3 - quit.");
				break;

			}
		}

		scc.close();
	}

}
