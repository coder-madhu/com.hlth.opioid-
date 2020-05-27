package slidingwindow;

public class FindSmallesSubArrayOfSumK {
	
	
	
	public static void main(String[] args) {
		int[] a = new int[] {4,2,2,7,8,1,2,8,1,0};
		int smallestSum =8; 
		// for first 3 sub array is 8 so it can be 3 but not the smallest subarray
		// move forward 
		System.out.println(findSmallestSubArray(a,smallestSum));
	}

	private static int findSmallestSubArray(int[] a, int smallestSum) {
		int minWindowSize = Integer.MAX_VALUE;
		int currentWindowSum =0;
		int windowStart =0;
		for(int windowEnd =0; windowEnd < a.length ; windowEnd++) {
			currentWindowSum += a[windowEnd];
			while(currentWindowSum >= smallestSum) {
				minWindowSize = Math.min(minWindowSize, windowEnd-windowStart+1);
				currentWindowSum -= a[windowStart];
				windowStart++;
			}
		}
		
		return minWindowSize;
	}

}
