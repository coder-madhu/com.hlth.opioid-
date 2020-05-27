package slidingwindow;

public class LongestContinuousSlindingSubSequence {
	//subset
	//subsequence
	//subarray
	//backtracking
	public static void main(String[] args) {
		int[] a = new int[] {1,3,5,4,7};
System.out.println(findLengthOfLCIS(a));
	}

	
	public static int findLengthOfLCIS(int[] nums) {
		int result =0;
		int anchor =0;
		for(int i=0; i<nums.length;i++) {
			if(i>0 && nums[i-1] >= nums[i]) anchor =i;
			result = Math.max(result, i-anchor+1);
		}
		return result;
	}
}
