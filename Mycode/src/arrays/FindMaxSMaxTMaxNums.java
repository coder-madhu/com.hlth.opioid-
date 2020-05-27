package arrays;
//first max secondmax and thrid max
public class FindMaxSMaxTMaxNums {

	public static void main(String[] args) {

		int[] num = new int[] {7,8,99,65,42,32,86,88,4,55,2,89};
		System.out.println(firdThirdMax(num));
		
	}

	private static Integer firdThirdMax(int[] num) {

		Integer max= null;
		Integer sMax=null;
		Integer tMax=null;
		
			for(Integer i : num) {
				if(i.equals(max) || i.equals(sMax)|| i.equals(tMax)) {
					continue;
				}
				if(max==null || i> max) {
					tMax=sMax;
					sMax=tMax;
					max = i;
				}else if(sMax == null || i > sMax) {
					tMax = sMax;
					sMax=i;
				}else if( tMax==null || i> tMax) {
					tMax=i;
				}
			}
			if(tMax==null) {
				return max;
			}
			return tMax;
	}

	
}
