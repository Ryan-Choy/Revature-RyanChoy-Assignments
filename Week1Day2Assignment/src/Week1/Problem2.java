package Week1;

public class Problem2 {
	// Problem 2 Print all the palindrome numbers between 100 and 999
	
	public static void main(String[] args) {
		System.out.println("The numbers that are palidromes are:");
/*		for (int i = 100; i <= 999; i++) {
			char[] pali = String.valueOf(i).toCharArray();
			if (pali[0] == pali[2]) {
				System.out.print(" " + i + " ");
			}
		}*/
		
		for(int i = 100; i <= 999;i++) {
			if (palidrome(i)){
				System.out.print(i + " ");
			}
		}
	}
	
	public static boolean palidrome(int a) {
		int hun =  (a - (a%100))/100; //101%100 =01 , 101-01=100, 100/100 = 1
		int sin = a%10; //101%10 = 01 = 1
		
		return hun == sin;
	}

}
