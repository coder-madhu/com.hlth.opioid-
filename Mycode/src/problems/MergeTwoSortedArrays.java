package problems;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	static int arr1[] = new int[]{1, 4,5, 9, 10, 15,17,19, 20,33,36}; 
    static int arr2[] = new int[]{2, 4, 8, 13}; 
    
   // Iterate through all elements of ar2[] starting from 
    // the last element 
    //time complexity is O(m+n)
    static void merge(int m, int n) {
    	for(int i=n-1 ; i>=0; i--) {
    		
    	       /* Find the smallest element greater than ar2[i]. Move all 
            elements one position ahead till the smallest greater 
            element is not found */
    		
    		int j, last= arr1[m-1];
    		for(j= m-2; j >=0 && arr1[j] > arr2[i]; j--) {
    			arr1[j+1]= arr1[j];
    		}
    		// If there was a greater element 
    		if(j!=m-2 || last> arr2[i]) {
    			arr1[j+1] = arr2[i];
    			arr2[i]= last;
    		}
    	}
    }
    
    public static void main(String[] args) {
    	merge(arr1.length,arr2.length);
    	System.out.println("After merging first array");
    	System.out.println(Arrays.toString(arr1));
    	System.out.println("After merging second array");
    	System.out.println(Arrays.toString(arr2));
    }
    
    
    static void mergee(int m, int n) {
    	
    	for( int i=n-1; i>=0;i--) {
    		
    		int j, last=arr1[m-1];
    		
    		for(j=m-2 ; j>=0 && (arr1[j]>arr2[i]) ; j--) {
    			arr1[j+1]= arr1[j];
    		}
    		
    	}
    	
    }
}
