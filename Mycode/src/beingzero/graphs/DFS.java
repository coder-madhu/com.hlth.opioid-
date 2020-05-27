package beingzero.graphs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import common.Graph;

public class DFS {

	public static void main(String[] args) {
		Graph<Integer> g = new Graph<Integer>();
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		dfs(g,1);
		System.out.println("=====================");
		g = new Graph<Integer>();
		g.setDirected(true);
		g.addEdge(1, 3);
		g.addEdge(1, 2);
		g.addEdge(3, 2);
		g.addEdge(3, 5);
		g.addEdge(4, 3);
		g.addEdge(4, 2);
		g.addEdge(5, 4);
		dfs(g,1);
		System.out.println("=====================");
		dfs(g,4);
	}

	private static void dfs(Graph<Integer> g,int startVertex) {
		 Map<Integer, List<Integer>> d = g.getAdjList();
		 Map<Integer,Boolean> visited = new HashMap<>();
		 DfsUtil(d,visited,startVertex);
	}
	
	static void DfsUtil(Map<Integer, List<Integer>> g, Map<Integer,Boolean> visited, int vertex){
		if (visited.get(vertex)==null || !visited.get(vertex)) {
			System.out.println("Visited:"+vertex);
			visited.put(vertex, true);
			List<Integer> adjVertices = g.get(vertex);
			if (adjVertices == null) {
				return;
			}
			for (int newVertex : adjVertices) {
				DfsUtil(g, visited, newVertex);
			}
		}
		return;
	}
}
