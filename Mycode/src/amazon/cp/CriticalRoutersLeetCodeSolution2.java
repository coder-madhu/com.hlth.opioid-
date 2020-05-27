package amazon.cp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CriticalRoutersLeetCodeSolution2 {

	static int[] disc;
	static int[] low;
	static List<List<Integer>> ans = new LinkedList<>();
	static Map<Integer, List<Integer>> adj = new HashMap<>();

	public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
		disc = new int[connections.size()];
		low = new int[connections.size()];
		for (int i = 0; i < n; i++) {
			adj.put(i, new ArrayList<Integer>());
		}
		for (List<Integer> conn : connections) { // build adjacency map
			adj.get(conn.get(0)).add(conn.get(1));
			adj.get(conn.get(1)).add(conn.get(0));
		}
		dfs(1, -1, 1);
		return ans;
	}

	private static void dfs(int node, int parent, int time) {
		disc[node] = low[node] = time;
		for (Integer n : adj.get(node)) {
			if (n == parent)
				continue; // skip parent node from which we came
			if (disc[n] == 0) { // unvisited
				dfs(n, node, ++time);
			}
			// node -> n is visited at this point, so update low
			low[node] = Math.min(low[node], low[n]);
			if (disc[node] < low[n]) { // neighbour is visited after the current node (no earlier path found)
				List<Integer> x = new ArrayList<Integer>() {
					private static final long serialVersionUID = 1L;
					{
						add(n);
						add(node);
					}
				};
				ans.add(x);
			}
		}
	}

	public static void main(String[] args) {
		List<List<Integer>> conn = new ArrayList<>();
		List<Integer> x = new ArrayList<>();
		x.add(1);
		x.add(2);
		conn.add(x);
		x = new ArrayList<>();
		x.add(2);
		x.add(3);
		conn.add(x);
		x = new ArrayList<>();
		x.add(1);
		x.add(3);
		conn.add(x);
		x = new ArrayList<>();
		x.add(1);
		x.add(4);
		conn.add(x);
		x = new ArrayList<>();
		x.add(4);
		x.add(5);
		conn.add(x);
		x = new ArrayList<>();
		x.add(5);
		x.add(6);
		conn.add(x);
		x = new ArrayList<>();
		x.add(6);
		x.add(7);
		conn.add(x);
		x = new ArrayList<>();
		x.add(7);
		x.add(5);
		conn.add(x);
		x = new ArrayList<>();
		x.add(6);
		x.add(8);
		conn.add(x);
		List<List<Integer>> r = criticalConnections(9, conn);
		for (List<Integer> c : r) {
			System.out.println(c.get(0) + "-" + c.get(1));
		}
		/*
		 * graph.addEdge(1, 2); graph.addEdge(2, 3); graph.addEdge(1, 3);
		 * graph.addEdge(1, 4); graph.addEdge(4, 5); graph.addEdge(5, 6);
		 * graph.addEdge(6, 7); graph.addEdge(7, 5); graph.addEdge(6, 8);
		 */
	}
}

/*
 * Find DFS and assign dfn to every vertex
 * find low for every vertex
 * check if dfn(u) < low(v) (u-parent, v child)
 * 
 */

/*
 * 
 * Articulation point in the router Trajan algorithm
 * 
 * Root Vertex with two Indepenedent Childern Visited Time <= low time of adj
 * Vertex
 * 
 */
