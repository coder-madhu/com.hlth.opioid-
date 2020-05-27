package trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {
	public final TrieNode root = new TrieNode();
	
	public void insert(String word) {
		TrieNode currentNode = root;
		for(int i =0; i<word.length();i++){
			char ch = word.charAt(i);
			TrieNode node = currentNode.childeren.get(ch);
			if(node==null) {
				node = new TrieNode();
				currentNode.childeren.put(ch, node);
			}
			currentNode= node;
		}
		currentNode.endOfWord=true;
	}
	
	public boolean search(String word) {
		
		TrieNode currentNode =root;
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			TrieNode node = currentNode.childeren.get(ch);
			if(node==null){
				return false;
			}
			currentNode = node;
		}
		
		
		if(currentNode.endOfWord==true) {
			System.out.println("found word");
			return true;
		}else {
			System.out.println("found word but not the fullword");
		}
		return false;
	}
	
	public static void main(String[] args) {
		Trie t = new Trie();
		t.insert("PALLA");
		t.insert("KRUTHIKA");
		t.insert("PALL");
		System.out.println(t.search("PALLA"));
		System.out.println(t.search("KRUTHIKA"));
		System.out.println(t.search("KRUTHI"));
		System.out.println(t.search("PALL"));
		System.out.println(t.search("PAL"));
		
	}
class	TrieNode{
	Map<Character,TrieNode> childeren = new HashMap<>();
	boolean endOfWord;
}

}
