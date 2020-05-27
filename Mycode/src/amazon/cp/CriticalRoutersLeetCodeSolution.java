package amazon.cp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CriticalRoutersLeetCodeSolution {
	
	    int[] disc;
	    int[] low;
	    List<List<Integer>> ans = new LinkedList<>();
	    List<Integer>[] adj;
	    
	    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections)     {
	        disc = new int[connections.size()];
	        low = new int[connections.size()];
	        adj = new List[connections.size()];
	        for (List<Integer> conn : connections) { // build adjacency map
	            if (adj[conn.get(0)] == null) adj[conn.get(0)] = new ArrayList();
	            if (adj[conn.get(1)] == null) adj[conn.get(1)] = new ArrayList();
	            adj[conn.get(0)].add(conn.get(1));
	            adj[conn.get(1)].add(conn.get(0));
	        }
	        dfs(0, -1, 1);
	        return ans;
	    }
	    
	    private void dfs(int node, int parent, int time) {
	        disc[node] = low[node] = time;
	        for (Integer n : adj[node]) {
	            if (n == parent)  continue; // skip parent node from which we came
	            if (disc[n] == 0) { // unvisited
	                dfs(n, node, ++time);
	            }
	            // node -> n is visited at this point, so update low
	            low[node] = Math.min(low[node], low[n]);
	            if (disc[node] < low[n]) { // neighbour is visited after the current node (no earlier path found)
	            	List<Integer> x= new ArrayList<Integer>() {
						private static final long serialVersionUID = 1L;
					{add(n);add(node);}};
	                ans.add(x);
	            }
	        }
	    }
	}

/*
 
Articulation point in the router
Trajan algorithm 

Root Vertex with two Indepenedent Childern
Visited Time <= low time of adj Vertex
 
 */
