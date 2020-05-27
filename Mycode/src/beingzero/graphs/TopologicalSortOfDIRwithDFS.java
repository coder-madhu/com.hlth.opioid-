package beingzero.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import common.Graph;

public class TopologicalSortOfDIRwithDFS {
	public static void main(String[] args) {
		Graph<Integer> g = new Graph<Integer>(5);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		List<Integer> tps	=	dfs(g);
		Collections.reverse(tps);
		for(int i: tps) {
		 System.out.println("-"+i);
		}
		System.out.println("=====================");
		g = new Graph<Integer>(6);
		g.setDirected(true);
		g.addEdge(1, 3);
		g.addEdge(1, 2);
		g.addEdge(3, 2);
		g.addEdge(3, 5);
	//	g.addEdge(4, 3);
		g.addEdge(4, 2);
		g.addEdge(5, 4);
		 tps	= dfs(g);
		Collections.reverse(tps);
		for(int i: tps) {
		 System.out.println("-"+i);
		}
	}

	private static List<Integer> dfs(Graph<Integer> g) {
		 List<Integer> topologicalSort = new ArrayList<Integer>();
		 Map<Integer, List<Integer>> d = g.getAdjList();
		 Map<Integer,Boolean> visited = new HashMap<>();
		 for(int i=1; i<g.N; i++) {
			if(visited.get(i)==null || !visited.get(i)) {
				DfsUtil(d,visited,i,topologicalSort);
				}
			}
		// DfsUtil(d,visited,startVertex,topologicalSort);
		return topologicalSort;
	}
	
	static void DfsUtil(Map<Integer, List<Integer>> g, Map<Integer,Boolean> visited, int vertex,List<Integer> topologicalSort){
		if (visited.get(vertex)==null || !visited.get(vertex)) {
			System.out.println("Visited:"+vertex);
			visited.put(vertex, true);
			List<Integer> adjVertices = g.get(vertex);
			if (adjVertices == null) {
				return;
			}
			for (int newVertex : adjVertices) {
				DfsUtil(g, visited, newVertex,topologicalSort);
			}
			topologicalSort.add(vertex);
		}
		return;
	}
}
