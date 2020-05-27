package bytebybyte50coding.todo;

public class Anagrams14 {

	// CAT are CAT, ACT, TAC, TCA, and CTA
	//2 words are anagram are not 
	// case insensitive
	
	static boolean isAnagran(String a, String b) {
		int alen = a.length();
		int blen = b.length();
		if(alen!=blen) return false;
		a= a.toLowerCase();
		b=b.toLowerCase();
		/*
		 * a= a.toLowerCase(); b= b.toLowerCase(); char[] achs= a.toCharArray(); char[]
		 * bchs = b.toCharArray(); Arrays.sort(achs); Arrays.sort(bchs);
		 
		 */
		
		int[] charFreq = new int[26];
		for(int i=0;i<alen ; i++) {
			char currchar = a.charAt(i);
			int idx = currchar-'a';
			charFreq[idx]++;
		}
		
		for(int i=0;i<blen ; i++) {
			char currchar = b.charAt(i);
			int idx = currchar-'a';
			charFreq[idx]--;
		}
		for(int i=0 ; i<26; i++) {
			if(charFreq[i]!=0) return false;
		}
		
return true;
	}

}
