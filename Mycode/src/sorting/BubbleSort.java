package sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] a = new int[] {8,5,7,99,3,6,8,9,4,2,44,55,88,66,5};
		a = bubbleSort(a);
		print(a);
	}

	private static void print(int[] a) {
		for(int i : a) {
			System.out.print(i+",");
		}
		
	}

	private static int[] bubbleSort(int[] a) {
		int n= a.length;
		for(int i=0; i< n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i]< a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
}
