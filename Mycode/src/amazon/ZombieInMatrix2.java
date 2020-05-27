/**
 * 
 */
package amazon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author PPalla1
 *
 */
public class ZombieInMatrix2 {
	

		
	public static void main(String[] args) {
		 int[][] mat = new int[][] {{0, 1, 1, 0, 1},
	        {0, 1, 0, 1, 0},
	        {0, 0, 0, 0, 1},
	        {0, 1, 0, 0, 0}};
	        System.out.println(findMinHours(mat));
	}

	private static int findMinHours(int[][] mat) {
		if(mat==null || mat.length==0) {
			return -1;
		}
		Queue<int[]> Q = new LinkedList<>();
		int DAYS =0;
		int humanCnt =0;
		for(int i =0; i< mat.length;i++) {
			for(int j=0; j<mat[i].length;j++) {
				if(mat[i][j]==0) {
					humanCnt++;
				}else {
					Q.offer(new int[] {i,j});
				}
		}
	}
		int[][] directions = new int[][] {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
		while(!Q.isEmpty() && humanCnt >0) {
			int qSize = Q.size();
			for(int i=0; i<qSize;i++) {
				int[] zombie = Q.poll();
				for(int[] d : directions) {
					int newX= zombie[0]+d[0];
					int newY= zombie[1]+d[1];
					if(newX >= 0 && newX < mat.length && newY >= 0 && newY < mat[0].length && mat[newX][newY] == 0) {
						mat[newX][newY]=1;
						Q.offer(new int[] {newX, newY});
						humanCnt--;
					}
				}
			}
			DAYS++;
		}
		return DAYS;
	}

	private static int findMinHours1(int[][] mat) {
		List<List<Integer>> m = new ArrayList<>();
	int[][] newGrid = m.stream()
            .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
            .toArray(int[][]::new);
	return 0;
	}
	


}
