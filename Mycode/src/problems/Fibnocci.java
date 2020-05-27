package problems;

public class Fibnocci {

	public static void main(String[] args) {
		System.out.println(fibnocci(10));
		int[] fib = fibSeries(10);
		for (int i = 0; i < fib.length; i++) {
			System.out.print(fib[i]+",");
			
		}
	}

	private static int fibnocci(int i) {
		if(i==0 || i==1) {
			return i;
		}
		return fibnocci(i-1)+fibnocci(i-2);
	}
	
	
	public static int[] fibSeries(int i) {
		int[] fib = new int[i];
		fib[0]=0;
		fib[1]=1;
		for(int k=2 ; k<i; k++) {
			fib[k]= fib[k-1]+fib[k-2];
		}
		return fib;
	}
}
