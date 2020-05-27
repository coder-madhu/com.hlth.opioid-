package sorting;

public class MergeTwoSortedArraysWithOutExtraArray {
	
	public static void main(String[] args) {
		int[] a = new int[] {3,5,6,7,8,9};
		int[] b = new int[] {1,2,3,4};
		
		merge(a,b);
		
		
	}

	 static void merge(int[] a, int[] b) 
	    { 
	        for (int i=b.length-1; i>=0; i--)  // iterate the 2nd list from end
	        { 
	            int j, last = a[a.length-1]; // 
	            for (j=a.length-2; j >= 0 && a[j] > b[i]; j--) 
	                a[j+1] = a[j]; 
	       
	            if (j != a.length-2 || last > b[i]) 
	            { 
	                a[j+1] = b[i]; 
	                b[i] = last; 
	            } 
	        }
	        
	        for(int s: a) {
				System.out.print(s+",");
			}
	        System.out.println();
			
			for(int s: b) {
				System.out.print(s+",");
			}
	    }
	 
	 private static void mergeAndPrint(int[] a, int[] b) {
			
			for(int i=b.length-1; i>=0 ; i--) {
				int j , last=a[a.length-1];
				
				for(j= a.length-2 ; j>=0 && a[j]>b[i] ; j--) {
					a[j+1]=a[j];
				}
				if( j!= a.length-2 && last > b[i]) {
					a[j+1] = b[i];
					b[i]= last;
				}
			}
			
			for(int s: a) {
				System.out.print(s+",");
			}
	        System.out.println();
			
			for(int s: b) {
				System.out.print(s+",");
			}
		}
	
}
