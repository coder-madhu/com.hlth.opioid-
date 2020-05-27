package sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = new int[] {8,5,7,99,3,6,8,9,4,2,44,55,88,66,5};
		a = selectionSort(a);
		print(a);
	}
	private static int[] selectionSort(int[] a) {
		for(int i=0; i< a.length; i++) {
			int minIndex = i;
			for(int j=i+1 ; j< a.length; j++) {
				if(a[j]<a[minIndex]) {
					minIndex =j;
				}
			}
			if(minIndex!=i) {
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
		}
		
		return a;
	}
	
	
	private static void print(int[] a) {
		for(int i : a) {
			System.out.print(i+",");
		}
	}
}
