package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	
	public static void main(String[] args) {
		int num = 5;
		List<List<Integer>> lst =pascalsTriangle(5);
		for(List<Integer> ss :lst) {
			System.out.println();
			for(int t :ss) {
				System.out.print(t);
			}
		}
	}

	private static List<List<Integer>> pascalsTriangle(int n) {
	List<List<Integer>> triangle = new ArrayList<>();	
	
		if(n==0) return triangle;
		
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);
		triangle.add(firstRow);
		for(int i=1;i<n ; i++) {
			List<Integer> prevRow = triangle.get(i-1);
			List<Integer> row = new ArrayList<>();
			row.add(1);
			for(int j=1 ;j<i;j++) {
				row.add(prevRow.get(j-1)+prevRow.get(j));
			}
			row.add(1);
			triangle.add(row);
		}
		return triangle;
	}

}
