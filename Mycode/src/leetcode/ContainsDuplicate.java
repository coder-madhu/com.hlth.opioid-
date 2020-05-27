package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	public static void main(String[] args) {
		int a[] = new int[] {1,5,6,2,5,6,9,2,2,2};
		System.out.println("containsDuplicate = "+containsDuplicate(a));
		System.out.println("containsDuplicate = "+containsDuplicate1(a));
	}

	private static boolean containsDuplicate(int[] a) {
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<a.length; i++) {
			if(set.contains(a[i])) {
				return true;
			}else {
				set.add(a[i]);
			}
		}
		return false;
	}
	private static boolean containsDuplicate1(int[] a) {
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			if(a[i]==a[i+1]) {
				return true;
			}
		}
		return false;
	}
	

}
