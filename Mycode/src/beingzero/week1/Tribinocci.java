package beingzero.week1;

public class Tribinocci {
	
	public static void main(String[] args) {
		int n=10;
		System.out.println(findTribnocci(n));
	}

	private static int findTribnocci(int n) {
	
		if(n==0 || n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
		return findTribnocci(n-1)+findTribnocci(n-2)+findTribnocci(n-3);
	}

}
