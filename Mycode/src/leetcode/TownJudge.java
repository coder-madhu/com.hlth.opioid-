package leetcode;

public class TownJudge {

	public static void main(String[] args) {
		int[][] trust = new int[][] { { 1, 3 }, { 2, 3 } };
		System.out.println(findJudge(3, trust));

	}

	public static int findJudge(int N, int[][] trust) {
		int[] count = new int[N+1];
		for(int[] t : trust) {
			count[t[0]]--;
			count[t[1]]++;
		}
		for(int i=1 ; i<=N ; i++) {
			if(count[i]==N-1) {
				return i;
			}
		}
		return -1;

	}

}
