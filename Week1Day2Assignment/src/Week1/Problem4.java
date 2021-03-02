package Week1;

public class Problem4 {
	public static void main(String[] args) {
		
		/*Problem 4: Find the sum of all even numbers between 1 and 100, 
		 * also find sum of all odd numbers between 1 and 100 and print the results and print which is largest among them(between evensum and oddsum)
		 */

			int a = 0;
			int b = 0;
			for(int i=1; i <= 100; i++) {
				if (i%2 == 0) {
					a = a + i;
				} else {
					b = b + i;
				}
				
			}
			System.out.println("The sum of even numbers is: "+ a);
			System.out.println("The sum of odd numbers is: "+b);
			if(a > b) {
				System.out.println("Even numbers make up the larger sum.");
			} else {
				System.out.println("Odd numbers make up the larger sum.");
			}
		
	}

}
