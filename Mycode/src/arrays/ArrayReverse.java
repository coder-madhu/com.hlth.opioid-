package arrays;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8};
		reverse(arr);
		reverseArr(arr);
	}

	private static void reverseArr(int[] a) {
		   int i=0;
		      int j= a.length-1;
		        while(j>=i){
		            int temp = a[i];
		            a[i]=a[j];
		            a[j]=temp;
		            i++;
		            j--;
		        }
		
	}

	private static void reverse(int[] arr) {

		int[] reversedArr = new int[arr.length];
		for(int i = arr.length-1, j=0 ; i>= 0 ; i--,j++) {
			System.out.println(arr[i]);
			reversedArr[j] = arr[i];
		}
		
		for (int i : reversedArr) {
			System.out.println(i);
		}
	}

}
