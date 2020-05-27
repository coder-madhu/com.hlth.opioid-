package amazon.cp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

import common.Pair;

public class TopKFrequentlyMentionedKeywords {

	public static void main(String[] args) {
	String[] keywords  =  new String[] {"anacell", "cetracular", "betacellular"};
	String[] reviews = new String[] {
	                    "I love anacell Best services; Best services provided by anacell",
	                    "betacellular has great services",
	                    "deltacellular provides much better services than betacellular",
	                    "cetracular is worse than anacell",
	                    "Betacellular is better than deltacellular"};
	
	String[] keywords1  =  new String[] {"anacell", "betacellular", "cetracular", "deltacellular", "eurocell"};
	String[] reviews1 = new String[] {
			"Anacell provides the best services in the city",
			  "betacellular has awesome services",
			  "Best services provided by anacell, everyone should use anacell"};
	int k =2;
	
	List<String> topk =findTopKWords(keywords,reviews,k); // expected ["anacell", "betacellular"]
	print(topk);
	topk = findTopKWords(keywords1,reviews1,k); // expecte ["betacellular", "anacell"]
	print(topk);
	
	System.out.println("*****************2222222***********");
	topk =findTopKWords1(keywords,reviews,k); // expected ["anacell", "betacellular"]
	print(topk);
	topk = findTopKWords1(keywords1,reviews1,k); // expecte ["betacellular", "anacell"]
	print(topk);
	}

	private static void print(List<String> topk) {
		System.out.println("*****************");
		for(String top: topk) {
			System.out.print("--"+top);
		}
		System.out.println("*****************");
	}
	
	
	//Using Collection.sort
		private static List<String> findTopKWords1(String[] keywords, String[] reviews, int k) {
			Map<String,Integer> occMap = new HashMap<>();
			 List<String> keyList = Arrays.asList(keywords);  
		
			for(String review : reviews) {
				String[] words = review.split(" ");
				for(String word:words ) {
					if(keyList.contains(word)) {
						if(occMap.containsKey(word)) {
							Integer count = occMap.get(word);
							count++;
							occMap.put(word, count);
						}else {
							occMap.put(word, 1);
						}
					}
				}
			}
		
			List<String> topKeys = new ArrayList<String>(occMap.keySet());
			Collections.sort(topKeys, (w1, w2) -> occMap.get(w1).equals(occMap.get(w2)) ? w1.compareTo(w2)
					: occMap.get(w2) - occMap.get(w1));
			
			return topKeys.subList(0, k);
		
	}
	
//Using Priority QUeue
	private static List<String> findTopKWords(String[] keywords, String[] reviews, int k) {
		List<String> topWords = new ArrayList<>();
		Map<String,Pair<String,Integer>> occMap = new HashMap<>();
		 List<String> keyList = Arrays.asList(keywords);  // TC: O(n)	
		for(String review : reviews) { // TC: O(n)	lines           } combinely TC O(n)*O(n)
			String[] words = review.split(" "); 
			for(String word:words ) { // TC: O(n)	 words 
				if(keyList.contains(word)) {  // TC: O(n)	 To search - can improve using set
					if(occMap.containsKey(word)) {  //// TC: O(1)	 map contains
						Pair<String,Integer> pair = occMap.get(word);
						int i=pair.getValue();
						pair.setValue(i);
						occMap.put(word, pair);
					}else {
						occMap.put(word, new Pair<String, Integer>(word,1)); // TC: O(1)	 adding to map
					}
				}
			}
		}
		
		PriorityQueue<Pair<String,Integer>> pq = new PriorityQueue<>(3,new Comparator<Pair<String,Integer>>() {
			@Override
			public int compare(Pair<String, Integer> o1, Pair<String, Integer> o2) {
				return o1.getValue()-o2.getValue();
			}

		});
		
		for(Entry<String, Pair<String, Integer>> entry: occMap.entrySet()) {
			pq.add(entry.getValue()); // logk
			if(pq.size()>k) {
				pq.poll();
			}
		}
		while(!pq.isEmpty()) { // // TC: O(k)	 words }
		Pair<String,Integer> pair = pq.poll();
		topWords.add(pair.getKey());
		}
		Collections.reverse(topWords);
		return topWords;
		
	}
}


	
	
