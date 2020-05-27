package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
	
	public static void main(String[] args) {
		int[] a = new int[] {2,3,4,5,6,7,8,9};
		int 		target = 11;
		int[] result  = findTwoSum(a,target);
		for(int s : result) {
			System.out.print(s+",");
		}
	}

	private static int[] findTwoSum(int[] a, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		int[] result = new int[] {};
		for(int i=0;i<a.length;i++) {
			map.put(a[i],i);
		}
		for(int i=0 ;i<a.length;i++) {
			int compliment = target - a[i];
			if(map.containsKey(compliment) && compliment!=i) {
				return new int[] {i+1,map.get(compliment)+1};
			}
		}
		return result;
	}

}
