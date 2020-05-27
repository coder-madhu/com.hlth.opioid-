package arrays;

public class SortArrayByParity {

	//Return arr with evens then odds
	public static void main(String[] args) {
		
		int[] arr = new int[] {4,8,6,9,5,4,55,2,55,24,45,15,88};
		arr = sortArrayByParity(arr);
		print(arr);
		System.out.println();
		arr = sortArrayByParity1(arr);
		print(arr);
	}

	private static int[] sortArrayByParity1(int[] arr) {
		int j=0;
		for(int i=0; i< arr.length ; i++,j++) {
			if(arr[i]%2==0) {
				int temp = arr[j];
				arr[j]= arr[i];
				arr[i]= temp;
			}
		}
		return arr;
	}

	private static void print(int[] arr) {
		for(int element: arr) {
			System.out.print(element+",");
		}
		
	}

	private static int[] sortArrayByParity(int[] arr) {
		int[] retArr = new int[arr.length];
		int j=0;
		for(int i =0;i < arr.length ;i ++) {
			if(arr[i]%2==0) {
				retArr[j]=arr[i];
				j++;
			}
		}
		for(int i=0; i< arr.length ; i++) {
			if(arr[i]%2>0) {
				retArr[j]=arr[i];
				j++;
			}
		}
		return retArr;
	}
	
}
