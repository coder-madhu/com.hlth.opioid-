package arrays;

public class RotateImage2DArr {

	//1,2,3
	//4,5,6
	//7,8,9
	
	// expected output is
	// assumption is n x n matix both rows and coloums are equal
	
	//7,4,1
	//8,5,2
	//9,6,3
	public static void main(String[] args) {
		
		int[][] a = new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}};
			
			rorate(a);
			
			print(a);
	}

	private static void print(int[][] a) {
		for(int i[]:a) {
			System.out.println();
			for(int b: i) {
				System.out.print(b+",");
			}
		}
	}

	private static void rorate(int[][] a) {
		int n = a.length;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp = a[i][j];
				a[i][j]=a[j][i];
				a[j][i]= temp;
			}
		}
		for(int i=0; i< n;i++) {
			for(int j=0; j<n/2;j++) {
				int temp= a[i][j];
				a[i][j]=a[i][n-1-j];
				a[i][n-1-j]=temp;
			}
			
			
		}
		
	}
}
