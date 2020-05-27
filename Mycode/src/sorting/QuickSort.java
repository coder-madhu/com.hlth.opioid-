package sorting;

public class QuickSort {
	/*
	 Quick sort algorithm is the divide and conquer algorithm
	 at each step it finds pivot and then makes sure that all the smaller elements are left of ppivot and bigger elements are right of pivot
	 it does this recursively until the entire array is sorted
	 unlike merge sort it dosent requires any external space
	 */
	public static void main(String[] args) {
		int[] a = new int[] {7,2,5,9,6,4,3,1,52,14,63,99,84,87,62,22};
		quickSort(a, 0,a.length-1);
		print(a);
	}
	
	private static void quickSort(int[] a, int left, int right) {
		if(left<right) {
			int pivot = calcuatePivot(a,left,right);
			quickSort(a,left, pivot-1);
			quickSort(a,pivot+1,right);
		}
		
	}

	private static int calcuatePivot(int[] a, int p, int q) {
		int pivot = q;
		int i = p-1;
		for(int j = p; j<=q ; j++) {
			if(a[j] <= a[pivot]) {
				i++;
				int temp = a[i];
				a[i]= a[j];
				a[j]=temp;
			}
		}
		return i;
	}
	
	
	static int partition(int[] array, int p, int q) {
		int pivot = q;
		int i = p-1;
		for (int j = p; j <= q; j++) {
			if (array[j] <= array[pivot]) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		return i;

	}//end of method
	private static void print(int[] a) {
		for(int i: a) {
			System.out.print(i+",");
		}
	}
}
