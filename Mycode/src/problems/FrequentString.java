package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequentString {
	
	public static void main(String[] args) {
		String sent= "I am I my name is I and you are not me and i am I you ask why that is I";
		System.out.println(top(sent,0));
		
	}

	private static String top(String sent, int i) {
		String[] words = sent.split(" ");
		Map<String, Integer> occuranceMap = new HashMap<>();
		for (int j = 0; j < words.length; j++) {
			if(occuranceMap.get(words[j])==null) {
				occuranceMap.put(words[j], 1);
			}else {
				int occu = occuranceMap.get(words[j]);
				occu = occu+1;
				occuranceMap.put(words[j], occu);
			}
		}
		
		List<String> sortedS= sortByWeight(occuranceMap);
		
		return sortedS.get(i);
	}

	
	public static List<String> sortByWeight(final Map<String, Integer> weightedWords) {
		List<String> words = new ArrayList<String>(weightedWords.keySet());
		Collections.sort(words, (w1, w2) -> weightedWords.get(w1).equals(weightedWords.get(w2)) ? w1.compareTo(w2)
				: weightedWords.get(w2) - weightedWords.get(w1));
		return words;
	}

}
