package beingzero.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import common.Graph;

public class BFS {
	
	
	public static void main(String[] args) {
		Graph<Integer> g = new Graph<Integer>();
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		bfs(g,1);
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
		bfs(g,1);
		System.out.println("=====================");
		bfs(g,4);
	}

	private static void bfs(Graph<Integer> g, int i) {
		Map<Integer,Boolean> visited = new HashMap<>();
		Map<Integer,List<Integer>> allNodes = g.getAdjList();
		Queue<Integer> q = new LinkedList<>(); 
		visited.put(i,true);
		q.add(i);
		while(!q.isEmpty()) {
			int node = q.poll();
			System.out.println("Visited:"+node);
			List<Integer> nodes = allNodes.get(node);
			if(nodes==null) {
				continue;
			}
			for(int newNode : nodes) {
				if(visited.get(newNode)==null || !visited.get(newNode)) {
					q.offer(newNode);
					visited.put(newNode, true);
				}
			}
		}
		
	}

}


