import java.util.Scanner;

public class ArrayPalindrome {
	public static void main(String[] args) {
		ArrayInput ai = new ArrayInput();
		int[] palin = ai.array();
		boolean flag = false;
		
		System.out.println("The palindrome numbers are: ");
		for (int i = 0; i < palin.length; i++) {
			palinArray(palin[i]);
			if(palinArray(palin[i]) == true) {
				flag = true;
				System.out.println(palin[i] + " ");
			}
		}
		if(flag == false) {
			System.out.println("There are no palindromes in the array.");
		}



	}

	public static boolean palinArray(int b) {
		int sum = 0;
		int r = 0;
		// store original value
		int orig = b;
		while (b > 0) {
			// get the last digit
			r = b % 10;
			// store digit in sum, when next digit is inserted, move current digit one place
			// to the left
			sum = (sum * 10) + r;
			// move to next digit
			b = b / 10;
		}
		if (orig == sum) {
			return true;
		} else {
			return false;
		}
	}

}
