package graphsearch;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
	
	int vertex;
	LinkedList<Integer> adj[];
	
	BFSGraph(int vertex){
		this.vertex = vertex;
		this.adj = new LinkedList[vertex];
		for(int i=0;i<vertex;i++) {
			adj[i]= new LinkedList<Integer>();
		}
	}
	
	void addEdge(int v1, int v2) {
		adj[v1].add(v2);
	}
	
	
			public static void main(String[] args) {
				BFSGraph g = new BFSGraph(5);
				g.addEdge(1, 0);
				g.addEdge(0, 2);
				g.addEdge(2, 1);
				g.addEdge(0, 3);
				g.addEdge(1, 4);
				g.BFS(0);
			}
			
			void BFS(int startNode){
				
				boolean[] visited = new boolean[vertex];
				Queue<Integer> queue = new LinkedList<Integer>();
				queue.add(startNode);
				while(!queue.isEmpty()) {
					int node = queue.poll();
					if(!visited[node]) {
						visited[node]=true;
						System.out.print(node + " ");
						LinkedList<Integer> adjNodes = adj[node];
						for (int adjVertex : adjNodes) {
							if (!visited[adjVertex]) {
								queue.add(adjVertex);
							}
						}
					}
				}
			}

}
