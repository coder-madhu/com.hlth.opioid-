package bytebybyte50coding.todo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/*
 Kth Most Frequent String
Question : Given a list of strings, write a function to get the kth most frequently
occurring string.
kthMostFrequent({ "a" , "b" , "c" , "a" , "b" , "a" }, 0 ) = "a"
kthMostFrequent({ "a" , "b" , "c" , "a" , "b" , "a" }, 1 ) = "b"
kthMostFrequent({ "a" , "b" , "c" , "a" , "b" , "a" }, 2 ) = "c"
kthMostFrequent({ "a" , "b" , "c" , "a" , "b" , "a" }, 3 ) = null
 */
public class KthMostFrequentString51TODO {

	public static void main(String[] args) {
		
		kthMostFrequent(new String[]{ "a" , "b" , "c" , "a" , "b" , "a" }, 0 );
		kthMostFrequent(new String[]{ "a" , "b" , "c" , "a" , "b" , "a" }, 1 );
		kthMostFrequent(new String[]{ "a" , "b" , "c" , "a" , "b" , "a" }, 2 );
		kthMostFrequent(new String[]{ "a" , "b" , "c" , "a" , "b" , "a" }, 3 );
	}
	
	
	private static void kthMostFrequent(String[] words, int k) {
		        Map<String, Integer> count = new HashMap();
		        for (String word: words) {
		            count.put(word, count.getOrDefault(word, 0) + 1);
		        }
		        PriorityQueue<String> heap = new PriorityQueue<String>(
		                (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
		                w2.compareTo(w1) : count.get(w1) - count.get(w2) );

		        for (String word: count.keySet()) {
		            heap.offer(word);
		            if (heap.size() > k) heap.poll();
		        }

		        List<String> ans = new ArrayList<>();
		        while (!heap.isEmpty()) ans.add(heap.poll());
		        Collections.reverse(ans);
		        print(ans);
		
	}

	public static void print(List<String> ans) {
		System.out.println("*********************");
		for(String s: ans) {
			System.out.print(s+",");
		}
	}

	
}


