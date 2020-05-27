package leetcode;

public class NumberOfIslands {
	
	static char[][] grid = new char[][] {
		{'1','1','1','1','0'},
		{'1','1','0','1','0'},
		{'1','1','0','0','0'},
		{'0','0','0','0','0'},		
	};
	
	static char[][] grid1 = new char[][] {
		{'1','1','0','0','0'},
		{'1','1','0','0','0'},
		{'0','0','1','0','0'},
		{'0','0','0','1','1'},		
	};
	
	public static void main(String[] args) {
		
	//	System.out.println("islands of G1 = "+findNumberOfIslands(grid));
		System.out.println("islands of G2 = "+findNumberOfIslands(grid1));
	}

	private static int findNumberOfIslands(char[][] g) {
		int islandCnt = 0;
		for(int i=0; i< g.length; i++) {
			for(int j=0; j<g[i].length;j++) {
				if(g[i][j]=='1') {
					islandCnt= islandCnt+1;
					bfs(g,i,j);
				}
			}
		}
		return islandCnt;
	}

	private static void bfs(char[][] g, int i, int j) {
		if(i < 0 || i>=grid.length || j<0  || j>=g[i].length || g[i][j]=='0') {
			return;
		}
		g[i][j]='0';
		bfs(g,i+1,j); //up
		bfs(g,i-1,j); //down
		bfs(g,i,j-1); //left
		bfs(g,i,j+1); //right
		
	}

}
