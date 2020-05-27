package graphsearch;

import java.util.LinkedList;
import java.util.Stack;

public class DFS {
	
	int vertex;
	LinkedList<Integer>[] adj;
	
	@SuppressWarnings("unchecked")
	DFS(int verex){
		this.vertex = verex;
		this.adj = new LinkedList[vertex];
		
		for(int i=0; i< vertex;i++) {
			this.adj[i]= new LinkedList<Integer>();
		}
	}
	
	void addEdge(int sourceNode, int destNode) {
		this.adj[sourceNode].add(destNode);
	}

	public static void main(String[] args) {
		DFS g = new DFS(5);
		g.addEdge(1, 0);
		g.addEdge(0, 2);
		g.addEdge(2, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 4);
		g.DFSUtil(0);
	}
	
	void DFSUtil(int startNode){
		
		Stack<Integer> dfsStk = new Stack<Integer>();	
		boolean[] visited = new boolean[this.vertex];
		dfsStk.push(startNode);
		while(!dfsStk.isEmpty()) {
		int node	= dfsStk.pop();
		if(!visited[node]) {
			visited[node]=true;
			System.out.print(node+",");
			LinkedList<Integer> nodes = this.adj[node];
			for(int adjNodes : nodes) {
				if(!visited[adjNodes]) {
					dfsStk.push(adjNodes);
				}
			}
		}
		}
		
	}
}
