package arrays;

public class ArrayRotation2DArray {
	public static void main(String[] args) {
		
		int[][] td = new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}};
			int numRotation = 1;
			td = rotate(td,numRotation);
			print(td);
	}

	private static int[][] rotate(int[][] td, int numRot) {
		int size = td.length;
		int j=0;
		int k=1;
		int nextval =0;
		for( int i=0;i< numRot; i++) {
			int first = td[j][k-1];
			for( ;j<size;j++) {
				for(;k<td[j].length;k++) {
					if(k>0) {
					td[j][k-1]=td[j][k];
					}
				}
				k=1;
				if(j+1 < size) {
				nextval=td[j+1][k-1];
				td[j][k+1]=nextval;
			
				}
			}
			td[j-1][td[j-1].length-1]= first;
			
		}
		return td;
	}

	private static void print(int[][] td) {
		for(int[] i : td) {
			System.out.println();
			for(int j: i) {
				System.out.print(j+",");
			}
		}
		
	}

}
