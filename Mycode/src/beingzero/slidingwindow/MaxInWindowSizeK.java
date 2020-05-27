package beingzero.slidingwindow;

public class MaxInWindowSizeK {
	public static void main(String[] args) {
		int[] A = new int[] {1,2,3,4,5,6,7,8,10,7,9};
		int k=3;
		findMaxinWindow(A,k);
	}

	private static void findMaxinWindow(int[] A, int k) {
		
		int start =k-1;
		int end=k-1;
		int MaxInFirstK =0;
		for(int i=0;i<k ;i++) {
			MaxInFirstK = Math.max(MaxInFirstK, A[i]);
		}
		System.out.println(MaxInFirstK);
		while(end<A.length) {
			if(end>=k-1){
				MaxInFirstK=Math.max(MaxInFirstK, A[start]);
				start++;
			}
			System.out.println(MaxInFirstK);
			end++;
		}
	}

}
