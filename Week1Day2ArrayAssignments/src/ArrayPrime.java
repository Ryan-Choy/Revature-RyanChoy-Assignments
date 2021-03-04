
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrime {

	public static void main(String[] args) {
		ArrayInput ai = new ArrayInput();
		int[] prime = ai.array();
		boolean pFlag = false;

		System.out.println("The prime numbers are:");
		for (int i = 0; i < prime.length; i++) {
			primeArray(prime[i]);

			if (primeArray(prime[i]) == true) {
				pFlag = true;
				System.out.print(prime[i] + " ");
			}
		}
		if (pFlag == false) {
			System.out.println("There are no prime numbers in the array.");
		}
		
	}
	
	public static boolean primeArray(int p) {
		int c = 0;
		for (int i = 1; i <= p; i++) {
			if (p % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return true;
		} else {
			return false;
		}
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
 * 5)Take an array input and find the 2nd max value in that array. 6)Perform
 * CRUD operations on Array Note:Use the Arrays util class effectively
 */