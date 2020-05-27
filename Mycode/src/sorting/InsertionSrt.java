package sorting;

public class InsertionSrt {
	public static void main(String[] args) {
		int[] a = new int[] {8,5,7,99,3,6,8,9,4,2,44,55,88,66,5};
		insertionSort(a);
		System.out.println();
		insertSort(a);
	//	print(a);
	}

	private static void print(int[] a) {
		for(int i : a) {
			System.out.print(i+",");
		}
		
	}

	private static void insertSort(int[] a) {
		for(int i=1; i< a.length; i++) {
			int currentNumber =  a[i], j=i;
						while(j>0 && a[j-1] > currentNumber ) {
							a[j]= a[j-1];
							j--;
						}
						a[j]=currentNumber;
		}
		 print(a);
	}
	
	static void insertionSort(int [] A) {
		 for(int  i = 1 ; i<A.length;i++) {  
			 int  tmp=A[i], j=i;
		     while ( j>0 && A[j-1]>tmp ) {	
		        A[j]=A[j-1];
		        j--;
		     }
		     A[j] = tmp;
		 }//end of for loop
		 print(A);
	}//end
	
	
}
