package arrays;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {

	public static void main(String[] args) {
		int[][] a = new int[][] {
			{1,2,3},
			{4,0,6},
			{7,8,9}	};
			
			System.out.println("Input");
			print(a);
			System.out.println();
			System.out.println("===============");	
			//	setMatrixZeros(a);
			correctsolSetMatrixZeros(a);
				System.out.println();
				System.out.println("===============");	
				print(a);
	}

	private static void correctsolSetMatrixZeros(int[][] a) {
		Set<Integer> R = new HashSet<>();
		Set<Integer> C = new HashSet<>();
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]==0) {
					R.add(i);
					C.add(i);
				}
			}
		}
		
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(R.contains(i) || C.contains(j)) {
					a[i][j]=0;
				}
			}
		}
	}

	private static void setMatrixZeros(int[][] a) {
		
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]==0) {
					setZero(a,i,j);
				}
			}
		}
	}

	private static void setZero(int[][] a, int i, int j) {
		for(int k=0;k<a[i].length;k++) {
			a[i][k]= 0;
		}
		for(int k=0;k<a.length;k++) {
			a[k][j]= 0;
		}
		
	}

	private static void print(int[][] a) {
		for (int i[] : a) {
			System.out.println();
			for (int s : i) {
				System.out.print(s + ",");
			}
		}

	}
	
	

}
