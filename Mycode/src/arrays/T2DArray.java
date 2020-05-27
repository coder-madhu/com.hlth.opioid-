package arrays;

public class T2DArray {

	public static void main(String[] args) {
		int[][] arr = new int[][] {
			{2,5},
			{7,8},
			{9,0},
			{2,4},
			{5,6}};
		traverse(arr);
	}

	private static void traverse(int[][] arr) {
		for(int i=0; i< arr.length ;i++) {
			for(int j=0; j< arr[i].length;j++) {
				System.out.println(i+""+j+arr[i][j]);
			}
		}
		
	}
	//O(m*n) time complexity for 2D array
}
