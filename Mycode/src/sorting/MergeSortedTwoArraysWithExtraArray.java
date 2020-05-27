package sorting;

public class MergeSortedTwoArraysWithExtraArray {

	public static void main(String[] args) {
		int[] a = new int[] { 5, 9, 11, 86, 99 };
		int[] b = new int[] { 1, 2, 3, 4, 6, 10, 12, 55, 91 };
		sortAndPrint(a, b);
	}

	private static void sortAndPrint(int[] a, int[] b) {
		int n = a.length;
		int m = b.length;

		int[] c = new int[n + m];
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {

			if (a[i] < b[j]) {
				c[k] = a[i];
				i++;

			} else {
				c[k] = b[j];
				j++;
			}
			k++;
		}
		while(i<n) {
			c[k]=a[i];
			k++;
			i++;
		}
		
		while(j<m) {
			c[k]=b[j];
			k++;
			j++;
		}

		print(c);
	}

	static void print(int[] ar) {
		System.out.print("Printing values :");
		for (int i : ar) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

}
