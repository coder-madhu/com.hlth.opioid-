package problems;

import java.util.Stack;

public class StringReverse {
	
	public static void main(String[] args) {
		String str ="PraveenPalla";
		reverseString(str);
		System.out.println();
		reverseString1(str);
		
		System.out.println();
		reverseString2(str);
		
	}

	private static void reverseString2(String str) {
		char[] chars = str.toCharArray();
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
		}
		
	}

	private static void reverseString1(String str) {
		for(int i=str.length()-1; i>=0;i-- ) {
			System.out.print(str.charAt(i));
		}
		
	}

	private static void reverseString(String str) {
		char[] chars = str.toCharArray();
		Stack<String> stk = new Stack<String>();
		for (int i = 0; i < chars.length; i++) {
			stk.push(String.valueOf(chars[i]));
		}
		
		while(!stk.isEmpty()) {
			System.out.print(stk.pop());
		}
		
		
	}

}
