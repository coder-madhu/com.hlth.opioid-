package slidingwindow;

public class LongestSum {
	//maximum sum of a contiguous subarray of size k

	public static void main(String[] args) {
		int[] nums = new int[] {8,7,9};
		int[] nums1 = new int[] {3 ,5, 1 ,9, 0};
		int[] nums2 = new int[] {9, 0, 1 ,2 ,9 ,2};
	//	
		System.out.println(getMaxSumSubArray(nums,2));
		System.out.println(getMaxSumSubArray(nums1,3));
		System.out.println(getMaxSumSubArray(nums2,5));
		System.out.println("===================");
		System.out.println(longestSum(nums,2));
		System.out.println(longestSum(nums1,3));
		System.out.println(longestSum(nums2,5));
	}
	
	public static int getMaxSumSubArray(int[] a, int k) {
		int maxSum =0;
		
		for(int i=0 ; i<a.length; i++) {
			int windowSum= 0;
			for(int j= i; j < i+k && j< a.length ; j++) {
				windowSum +=  a[j];
			}
			maxSum = Math.max(maxSum, windowSum);
			
		}
		
		return maxSum;
	}
	
	
	   static int longestSum(int[] a, int k){
		   int maxValue = Integer.MIN_VALUE;
		   int currentRunnigSum = 0;
		   for(int i = 0; i< a.length; i++) {
			   currentRunnigSum += a[i];
			   if(i >= k-1) {
				   maxValue = Math.max(maxValue, currentRunnigSum);
				   currentRunnigSum -= a[i-(k-1)];
			   }
		   }
		   return maxValue;
		   
	    }
}

/*
 How to find the problems
 -	 well sutiable for the iterable items
 		things we iterate over sequentially
 			concerned with contiguous sequence of elements
 			String, Arrays, Linkedlist
 	min max longest, shortest contained
 		- may be we need to calculated some thing
 		
 Questons Variant 
  
 Fixed Length
 	max sum sub array of size k
 Dynamic Variant
 	Smallest sum gereater than or equal to SomeValue S
 Dynamic Variant with Auxiallary Data structure
 	(using maps,hash set, addl array etc, like boolean..)
 		find the longest substring with not more than k distinct characters (using hashmap or hashset)
 String permutations
 
 what is the commanalaties
 - everything is grouped sequentially
 - every thing is specified to some sequential criteraia (key words- smallest, longest, contains, maximize, minimize)
 
 
 * 
 */

