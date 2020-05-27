package arrays;

public class ArrayRotation1D {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int rotation = 3;
		arr = leftRotationStep(arr, rotation );
		print(arr);
	}

	private static void print(int[] arr) {
		for(int i: arr) {
			System.out.print(i+",");
		}
		
	}

	private static int[] leftRotationStep(int[] arr, int rot) {
		int arrsz= arr.length;
		for(int i=0; i< rot; i++) {
			int temp = arr[0];
			for(int j=1;j<arrsz; j++) {
				arr[j-1] = arr[j];
			}
			arr[arrsz-1]= temp;
		}
		return arr;
	}

}
