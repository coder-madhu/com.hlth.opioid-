package beingzero.graphs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import common.Graph;

public class BFSLevelArray {
	
	
	public static void main(String[] args) {
		Graph<Integer> g = new Graph<Integer>(5);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		bfs(g,1);
		System.out.println("=====================");
		g = new Graph<Integer>(6);
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
		
		System.out.println("*********BFS For entire Graph************");
		for(int i=1; i<g.N; i++) {
			System.out.println("BFS For Vertex:"+i);{
				bfs(g,i);
			}
		}
	}

	private static void bfs(Graph<Integer> g, int i) {
		int[] level = new int[g.N];
		Arrays.fill(level, -1);
		Map<Integer,List<Integer>> allNodes = g.getAdjList();
		Queue<Integer> q = new LinkedList<>(); 
		level[i]=0;
		q.add(i);
		while(!q.isEmpty()) {
			int node = q.poll();
			System.out.println("Visited:"+node+"- at level : "+level[node ]);
			List<Integer> nodes = allNodes.get(node);
			if(nodes==null) {
				continue; 
			}
			for(int newNode : nodes) {
				if(level[newNode]==-1) {
					q.offer(newNode);
					level[newNode]=1+level[node];
				}
			}
		}
		
	}

}


