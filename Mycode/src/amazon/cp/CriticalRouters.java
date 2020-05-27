package amazon.cp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CriticalRouters {
	
	public static void main(String[] args) {
		int[][] edges= new int[][] {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 5}, {5, 6}, {3, 4}};
		int nodes = 7;
		criticalRouters(edges,nodes);
	}
	private static void criticalRouters(int[][] edges, int nodes) {
		Map<Integer, List<Integer>> graph = new HashMap<>();
		for(int i=0; i< nodes; i++) {
			graph.put(i, new ArrayList<Integer>());
		}
		for(int[] link : edges) {
				graph.get(link[0]).add(link[1]);
				graph.get(link[1]).add(link[0]);
		}
		
		printGraph(graph);
	}
	private static void printGraph(Map<Integer, List<Integer>> graph) {
		for(Map.Entry<Integer, List<Integer>> node: graph.entrySet()) {
			System.out.println();
			System.out.print("Node:"+node.getKey()+"-");
			for(int i : node.getValue()) {
				System.out.print(i+" ");
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
