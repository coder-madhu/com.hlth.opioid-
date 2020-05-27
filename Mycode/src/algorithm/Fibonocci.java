package algorithm;

public class Fibonocci {
	
	public static void main(String[] args) {
		int fib = fibnocci(10);
		System.out.println(fib);
		fib(10);
	}

	private static void fib(int i) {
		int[] fibseries = new int[i+1];
		fibseries[0]=0;
		fibseries[1]=1;
		for(int j=2; j<=i;j++) {
			fibseries[j]= fibseries[j-1]+fibseries[j-2];
		}
		
		for(int s  :fibseries) {
			System.out.print(s+",");
		}
		
	}

	private static int fibnocci(int i) {
		
		if( i==0 || i== 1) {
			return i;
		}
		return fibnocci(i-1)+fibnocci(i-2);
		
	}

}
