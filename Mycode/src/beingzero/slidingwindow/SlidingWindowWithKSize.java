package beingzero.slidingwindow;

public class SlidingWindowWithKSize {

	public static void main(String[] args) {
		int[] A = new int[] { 4, 5, 3, 2, 8, 6 };
		// System.out.println(slideKMaxSum(A,3));
		System.out.println(SlideKMaxSumOptimal(A, 3));
	}
	// find the sum o

	// BruteFore solution O(n*k)
	static int slideKMaxSum(int[] a, int k) {
		int windowSum = 0;
		for (int i = 0; i < (a.length - k + 1); i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += a[j];
			}
			windowSum = Math.max(windowSum, sum);
		}
		return windowSum;

	}

	// optimal O(n);
	static int SlideKMaxSumOptimal(int[] a, int k) {
		int windowSum = 0;
		int start = 0;
		int end = 0;
		int MaxSum =0;
		while (end < a.length) {
			windowSum += a[end];
			if (end >= k - 1) {
				MaxSum = Math.max(MaxSum, windowSum); // or you can write condition if current window sum is > maxSum update maxSum
			//	System.out.println(windowMaxSum);
				windowSum -= a[start];
				start++;
			}
			end++;
		}
		return MaxSum;
	}
}
