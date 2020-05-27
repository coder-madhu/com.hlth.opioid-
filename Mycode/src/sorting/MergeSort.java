package sorting;

public class MergeSort {

		
	public static void main(String[] args) {
		int[] a = new int[] {7,2,5,9};
		//6,4,3,1,52,14,63,99,84,87,62,22
		mergeSort(a,0,a.length-1);
		print(a);
	}
	
	private static void print(int[] a) {
		for(int i: a) {
			System.out.print(i+",");
		}
		
	}

	private static void mergeSort(int[] arr, int left, int right) {
		if(right > left) {
			int mid = (left+right)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}

	private static void merge(int[] arr, int left,int mid, int right) {
		int n1= mid-left+1;
		int n2 = right-mid;
		int[] leftArr = new int[n1];
		int[] rightArr= new int[n2];
		
		for(int i=0;i<n1;i++)
			leftArr[i] = arr[left+i];
		
		for(int i=0;i<n2;i++) 
			rightArr[i] = arr[mid+1+i];
		
		int i=0; //initial index of first subarray
		int j=0; //inital index of second subarray
		int k=1; // intial index of mergedsubArray
		while(i <n1 && j<n2) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			}else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k]=leftArr[i];
			k++;
			i++;
		}
		while(j<n2) {
			arr[k]=rightArr[j];
			k++;
			j++;
		}
		
	}
}

class MergeSortr 
{ 
    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSortr ob = new MergeSortr(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
} 
