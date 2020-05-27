package bytebybyte50coding.todo;

/*
 3. Matrix product
Question : Given a matrix, find the path from top left to bottom right with the greatest
product by moving only down and right.
eg.
[ 1 , 2 , 3 ]
[ 4 , 5 , 6 ]
[ 7 , 8 , 9 ]
1 -> 4 -> 7 -> 8 -> 9
2016
[ -1 , 2 , 3 ]
[ 4 , 5 , -6 ]
[ 7 , 8 , 9 ]
-1 -> 4 -> 5 -> -6 -> 9
1080
Solution : https://www.byte-by-byte.com/matrixproduct/
 */
public class MatrixProduct3TODOFIX {
	static int[][] mat  = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
	public static void main(String[] args) {
	//	int[][] mat  = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		printArray(mat);
		System.out.println();
		System.out.println("=========================");
//		bruteForceSolution(mat);
		 recursiveSolution(mat,0,0);
		 System.out.println(total);
		 System.out.println(path);
	}
	static int M = mat.length;
	static int N = mat[0].length;
	static int total=1; 
	static String path="";
static int recursiveSolution(int[][] mat, int i , int j) {

	if(i>=M || j>=N || i<0 || j<0 ) {
		return total;
	}
	path += "->"+mat[i][j];
	total *=mat[i][j];
	int down =  recursiveSolution(mat,i+1,j);
	System.out.println(down);
	int up=	 recursiveSolution(mat,i,j+1);
	System.out.println(up);
	 
	return Math.max(down, up);
}

	/*
	 * recursive(i,j,total){ total *=mat[i][j]; if(i==M-1 && j==N-1) { return total;
	 * }
	 * 
	 * }
	 */
	
	/*
	 * def matrix_product(matrix): (m, n)=(len(matrix), len(matrix[0])) def
	 * recurse(i, j, total): total*=matrix[i][j] if i==m-1 and j==n-1: return total
	 * down = total if i==m-1 else recurse(i+1, j , total) right = total if j==n-1
	 * else recurse(i , j+1, total) return max(down, right) return recurse(0, 0, 1)
	 * 
	 * 
	 * 
	 */	

	static void printArray(int[][] mat){
		for(int i[] : mat) {
			System.out.println();
			for(int j: i) {
				System.out.print(j+",");
			}
		}
	}
}
