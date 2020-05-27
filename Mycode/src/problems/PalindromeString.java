package problems;

public class PalindromeString {
	
	public static void main(String[] args) {
		String p ="racecar";
		String Q ="ABCDCBA";
		String D ="PALLALLAP";
		String G ="sdfsdfsdfs";
		System.out.println("Palindrome = " +palindrome(p));
		System.out.println("Palindrome = " +palindrome(Q));
		System.out.println("Palindrome = " +palindrome(D));
		System.out.println("Palindrome = " +palindrome(G));
		
	}

	private static boolean palindrome(String p) {
		int i =0;
		int j = p.length()-1;
		while(i<j) {
			if(p.charAt(i)!=p.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
