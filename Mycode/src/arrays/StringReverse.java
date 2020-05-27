package arrays;

import java.util.Stack;

public class StringReverse {
	
	public static void main(String[] args) {
		String str ="PRAVEEN";
		stringreverse(str);
		System.out.println();
		stringReverse1(str);
	}


	private static void stringReverse1(String str) {
		for(int i=str.length()-1;i>=0 ;i --) {
			System.out.print(str.charAt(i));
			
		}
		
	}

	private static void stringreverse(String str) {

		char[] chars = str.toCharArray();
		
	Stack<Character> charstack = new Stack<>();
	for(char charss: chars) {
		charstack.push(charss);
	}
	
	while(!charstack.isEmpty()) {
		System.out.print(charstack.pop());
	}
	}

}
