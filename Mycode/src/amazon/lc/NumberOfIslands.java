package amazon.lc;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if(grid==null ){
            return 0;
        }
        int noOfIslands =0;
           for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]=='1'){
                    noOfIslands++;
                    search(grid,i,j);
                }
            }
        }
        return noOfIslands;
    }
    
    void search(char[][] grid, int i, int j){
        
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        search(grid,i+1,j);
        search(grid,i-1,j);
        search(grid,i,j+1);
        search(grid,i,j-1);
    }
}