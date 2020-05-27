package beingzero.week1;

public class AmstrongNumberHackerEarth {
	
	public static void main(String[] args) {
		int n = 371;
		String s = String.valueOf(n);
		int amNum =0;

		for(int i=0; i<s.length(); i++) {
			amNum+=getCube(Integer.parseInt(String.valueOf(s.charAt(i))));
		}
		if(n==amNum) {
			System.out.println("isAmstrong");
		}else {
			System.out.println("NotAmstrong");
		}
	
	}
	
	static int getCube(int x){
		return x*x*x;
	}
	
//	int sum =0;
//	while(n!=0) {
//		sum += getSquare(n%10);
//		n = n/10;
//	}

}
//	int thirdDigit =n%10;
//int middleDigit = (n/10)%10;
//int firstDigit = (n/100);