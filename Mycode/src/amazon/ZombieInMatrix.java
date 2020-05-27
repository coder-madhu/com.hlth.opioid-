 
package amazon;

/**
 * @author PPalla1
 *
 */
public class ZombieInMatrix {
	
	static int[][] mat = new int[][] {{0, 1, 1, 0, 1},
        {0, 1, 0, 1, 0},
        {0, 0, 0, 0, 1},
        {0, 1, 0, 0, 0}};
    	static int m = mat.length;
		static int n = mat[0].length;
		
	public static void main(String[] args) {
		    int noOfHrs = 0;
		    
		    for(int i=0; i<mat.length;i++) {
		    	for(int j=0;j<mat[i].length;j++) {
		    		if(mat[i][j]==0) {
		    			bfs(mat,i,j);
		    			noOfHrs++;
		    		}
		    	}
		    }
		  System.out.println(noOfHrs);
	}
	private static void bfs(int[][] mat,int i, int j) {
		
		if(i < 0 || i >= mat.length || j<0 || j>=mat[i].length || mat[i][j]==1) {
			return;
		}
			mat[i][j]=1;
		bfs(mat,i+1,j); //up
		bfs(mat,i-1,j); //down
		bfs(mat,i,j-1); //left
		bfs(mat,i,j+1); //right
		}

}
