package patterns;

public class T2DarrayPrint {
	
	public static void main(String[] args) {
		int[][] a = new int[][] {
			{2,5},
			{7,8},
			{9,0},
			{2,4},
			{5,6}};
			for(int[] s : a) {
				for(int c: s)
				System.out.println(c+","+c);
			}
	}

}
