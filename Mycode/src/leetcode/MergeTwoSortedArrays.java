package leetcode;

public class MergeTwoSortedArrays {

	
	public static void main(String[] args) {
		int[] a = new int[] {1,9,15,18,25,33,41,46,60,0,0,0,0};
		int[] b= new int[] {2,4,11,16};
		mergeAndPrint(a,b);
	}

	private static void mergeAndPrint(int[] a, int[] b) {
		int m = a.length;
		int n = b.length;
		int first = m-1;
		int second = n-1;
		for(int i= m+n-1 ; i>0; i--) {
			if(second < 0) {
				break;
			}
		}
	}

	
	
}
