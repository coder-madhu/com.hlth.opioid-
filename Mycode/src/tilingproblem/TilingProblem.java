package tilingproblem;

//number of ways to fill the space with 2*n wiht 2*1 tiles
public class TilingProblem {

	public static void main(String[] args) {
		
		System.out.println(noOfways(8));
	}
	
	static int noOfways(int n) {
		if(n==1) return 1;
		if(n==2) return 2;
		return noOfways(n-1)+ noOfways(n-2);
	}
}
