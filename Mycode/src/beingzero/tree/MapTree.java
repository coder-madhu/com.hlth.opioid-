package beingzero.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTree {

	public static void main(String[] args) {
		Map<Integer,List<Integer>> tree= new HashMap<>();
		int n=10;
		for(int i=0; i<=n; i++) {
			tree.put(i, new ArrayList<>());
		}
	}
}
