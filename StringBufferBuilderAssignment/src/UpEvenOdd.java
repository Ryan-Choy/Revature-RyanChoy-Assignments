
public class UpEvenOdd {
	
	public static void main(String[] args) {
		String eo = "The quick brown fox jumps over the lazy dog";
		System.out.println("Input: "+ eo);
		String ar[] = eo.split(" ");
		StringBuilder ueo = new StringBuilder();
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i].length()%2 == 0) {
				ueo.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
			} else {
				ueo.append(ar[i].substring(0, (ar[i].length())/2)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()/2))).append(ar[i].substring(ar[i].length()/2+1, ar[i].length())).append(" ");
			}
		}
		System.out.println(ueo.toString().trim());


		
	}

}
//2)Take a sentence as input and for the word with length odd convert the middle character to uppercase and for the word length even convert the
//first character to uppercase.