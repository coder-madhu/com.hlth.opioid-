package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class WordsReverse {
	
	public static void main(String args[]) {
		String sentence ="my name is praveen";
		reverse(sentence);
	}

	private static void reverse(String sentence) {
		Stack<String> wordStack = new Stack<String>();
		String word="";
		for(int i=0 ; i< sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				wordStack.push(word);
				word="";
			}else {
				word= word+sentence.charAt(i);
			}
		}
		wordStack.push(word);
		while(!wordStack.isEmpty()) {
			System.out.print(wordStack.pop()+" ");
		}
	}

	

	private static void reverse1(String sentence) {
		List<Character> chars = new ArrayList<>();
		for(int i=sentence.length()-1 ; i>=0;i--) {
		
			if(Character.isWhitespace(sentence.charAt(i))) {
				printReverse(chars);
				chars= new ArrayList<>();
			}
			chars.add(sentence.charAt(i));
		}
		printReverse(chars);
	}

	private static void printReverse(List<Character> chars) {
		Collections.reverse(chars);
		for(Character f : chars) {
			System.out.print(f);
		}
	}

	private static void print(List<Character> chars) {
		for(Character f : chars) {
			System.out.print(f);
		}
	}

}
