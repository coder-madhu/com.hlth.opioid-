package bytebybyte50coding.todo;

import java.util.HashSet;

public class ConsecutiveArrays5 {
	
	//[4,2,1,6,5]= 3  [4,5,6]
//	[5,5,3,1] = 1 [1],[3],[5]
 //we can sort and get the consequtive
	//login is O(n log n)
	
	int[] a = new int[] {4,2,};
	
	public int consequetive(int[] a) {
		HashSet<Integer> values = new HashSet<>();
		for(int i: a) {
			values.add(i);
		}
		int max=0;
		for(int i : values) {
			if(values.contains(i-1))continue;
			int length = 0;
			while(values.contains(i++)) length++;
			max= Math.max(max, length);
		}
		return max;
	}
}
