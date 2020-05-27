package arrays;

public class FlipAndReverseImage {
	//https://www.youtube.com/watch?v=k8YI7lv42DA&list=PLU_sdQYzUj2kO75GVOBRAU78K7mHG0pMP&index=8
	public static void main(String[] args) {
		
		int[][] flipimage = new int[][] {{1,1,0},{1,0,1},{1,1,1}};
		flipimage=	flipImageAndPrint(flipimage);
		for(int i =0; i< flipimage.length;i++) {
			System.out.println();
			for(int j=0; j< flipimage[i].length;j++) {
				System.out.print(flipimage[i][j]);
			}
		}
	}

	private static int[][] flipImageAndPrint(int[][] a) {
		for(int i=0; i< a.length; i++) {
			int low=0;
			int high = a[i].length-1;
			while(low<=high) {
				if(a[i][low]== a[i][high]) {
					a[i][low]=1-a[i][low];
					a[i][high]= a[i][low];
				}
				low++;
				high --;
			}
		}
		return a;
		
	}

}
