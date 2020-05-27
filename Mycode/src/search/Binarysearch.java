package search;

//works searching on sorted array only

public class Binarysearch {

	public static void main(String[] args) {
		int[] a = new int[] {-1,2,5,9,63,99,125,565};
		int find =9;
		int index =search(a, find );
		System.out.println(index);
	}

	private static int search(int[] a, int find) {

		int left=0;
		int right = a.length-1;
while(left<=right) {
	int mid = left+ (right-left)/2;
	if(a[mid]==find) {
		return mid;
	}else if(a[mid]> find) {
		right =mid -1;
	}else {
		left= mid+1;
	}
}
return -1;
	}
}
