package bytebybyte50coding.todo;


public class ZeroOrOneKnapsack2TODO {

	int knapsackAux(int[] profits,int[] weights, int capacity ,int currentindex) {
		if(capacity <=0 || currentindex <0 || currentindex >= profits.length) {//base case{
			return 0;
	  }
		int profit1 = 0;
		int profit2 = 0;
		if(weights[currentindex] <=capacity)  // taking current index{
			profit1 = profits[currentindex]+ knapsackAux(profits, weights, capacity-weights[currentindex], currentindex);
		
		
			profit2= knapsackAux(profits, weights, capacity, currentindex+1);
		return Math.max(profit1, profit2);
		
	}
	
	private int knapsackAuxORIG(int[] profits, int[] weights, int capacity, int currentIndex) {
		if (capacity <= 0 || currentIndex < 0 || currentIndex >= profits.length)//Base case
			return 0;

		int profit1 = 0;
		if (weights[currentIndex] <= capacity) // Taking current element
			profit1 = profits[currentIndex] + knapsackAux(profits, weights, capacity - weights[currentIndex], currentIndex + 1);

		int profit2 = knapsackAux(profits, weights, capacity, currentIndex + 1); // Not taking current element
		return Math.max(profit1, profit2);
	}//end of method

	
	public int knapsack(int[] profits, int[] weights, int capacity) {
		return this.knapsackAuxORIG(profits, weights, capacity, 0);
	}
	
	public static void main(String[] args) {
		ZeroOrOneKnapsack2TODO ks = new ZeroOrOneKnapsack2TODO();
		int[] profits = { 31, 26, 72, 17 };
		int[] weights = { 3, 1, 5, 2 };
		int maxProfit = ks.knapsack(profits, weights, 7);
		System.out.println(maxProfit);
	}//end o
}
