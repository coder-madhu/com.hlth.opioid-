package topk;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequent {
		  public List<Integer> topKFrequent(int[] nums, int k) {
		    // build hash map : character and how often it appears
		    HashMap<Integer, Integer> count = new HashMap();
		    for (int n: nums) {
		      count.put(n, count.getOrDefault(n, 0) + 1);
		    }

		    // init heap 'the less frequent element first'
		    PriorityQueue<Integer> heap =
		            new PriorityQueue<Integer>((n1, n2) -> count.get(n1) - count.get(n2));

		    // keep k top frequent elements in the heap
		    for (int n: count.keySet()) {
		      heap.add(n);
		      if (heap.size() > k)
		        heap.poll();
		    }

		    // build output list
		    List<Integer> top_k = new LinkedList();
		    while (!heap.isEmpty())
		      top_k.add(heap.poll());
		    Collections.reverse(top_k);
		    return top_k;
		  }
		}
/**
 Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
 */
