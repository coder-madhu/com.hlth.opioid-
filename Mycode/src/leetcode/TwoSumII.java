package leetcode;

public class TwoSumII {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 7, 11, 15 };
		int target = 99;
		int twosum[] = getTwoSum(a, target);
		for(int k: twosum) {
			System.out.print(k+",");
		}
	}

	private static int[] getTwoSum(int[] a, int target) {
		int a_ptr = 0;
		int b_ptr = a.length - 1;
		while (a_ptr <= b_ptr) {
			int sum = a[a_ptr] + a[b_ptr];
			if (sum > target) {
				b_ptr = b_ptr - 1;
			} else if (sum < target) {
				a_ptr = a_ptr+1;
			} else {
				return new int[] { a_ptr + 1, b_ptr + 1 };
			}
		}
		return new int[] {};
	}

}
