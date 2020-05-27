package graphsearch;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

@SuppressWarnings("unchecked")
public class DFSGraph {
	int vertex;
	@SuppressWarnings("rawtypes")
	LinkedList adj[];

	DFSGraph(int vertex) {
		this.vertex = vertex;
		this.adj = new LinkedList[vertex];
		for (int i = 0; i < vertex; i++) {
			this.adj[i] = new LinkedList<>();
		}
	}

	void addEdge(int v1, int v2) {
		adj[v1].add(v2);
	}

	public static void main(String[] args) {
		/*
		 * DFSGraph g= new DFSGraph(4); g.addEdge(0, 1); g.addEdge(0, 2); g.addEdge(1,
		 * 2); g.addEdge(2, 0); g.addEdge(2, 3); g.addEdge(3, 3);
		 * 
		 * g.DFS(2); System.out.println(); g.DFS1(2);
		 */
		DFSGraph g = new DFSGraph(5);
		g.addEdge(1, 0);
		g.addEdge(0, 2);
		g.addEdge(2, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 4);
		g.DFS(0);
		System.out.println();
		g.DFS1(0);
	}

	public void DFS(int searchNode) {
		boolean visited[] = new boolean[vertex];
		Stack<Integer> stk = new Stack<>();
		stk.push(searchNode);
		while (!stk.isEmpty()) {
			int visitedNode = stk.pop();
			if (!visited[visitedNode]) {
				visited[visitedNode] = true;
				System.out.print(visitedNode + " ");
				LinkedList<Integer> adjNodes = adj[visitedNode];
				for (int adjVertex : adjNodes) {
					if (!visited[adjVertex]) {
						stk.push(adjVertex);
					}
				}
			}
		}

	}

	void DFSUtil(int v, boolean visited[]) {
		System.out.print(v + " ");
		visited[v] = true;
	//	Iterator<Integer> i = adj[v].listIterator();
		for(int x = adj[v].size()-1; x>=0; x--) {
			int n = (int) adj[v].get(x);
			if (!visited[n])
				DFSUtil(n, visited);
		}
		/*
		 * while (i.hasNext()) { int n = i.next(); if (!visited[n]) DFSUtil(n, visited);
		 * }
		 */

	}

	void DFS1(int v) {

		boolean visited[] = new boolean[vertex];
		DFSUtil(v, visited);
	}

}
