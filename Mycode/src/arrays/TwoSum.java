package arrays;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {
	public static void main(String[] args) {
		int[] a = new int[]{2,3,6,9,6,96,8,10};
		int[] b= new int[]{6,5,8,4,5,99,66,33,56};
		System.out.println("two Sum result = "+hasSum(a,b,152));
		System.out.println("two Sum result = "+hasSum1(a,b,152));
		
		System.out.println("two Sum result = "+hasSum1(a,b,88));
	}

	private static boolean hasSum(int[] a, int[] b, int v) {
		for(int i=0 ; i< a.length ; i++) {
			for(int j=0; j< b.length ;j ++) {
				int sum = a[i]+b[j];
				if(sum==v) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean hasSum1(int[] a, int[] b, int v) {
		Set<Integer> st = new HashSet<Integer>();
		for(int i=0; i<a.length ;i++) {
			st.add(v-a[i]);
		}
		for(int i=0;i<b.length;i++) {
			if(st.contains(b[i])) {
				return true;
			}
		}
		return false;
	}

}
