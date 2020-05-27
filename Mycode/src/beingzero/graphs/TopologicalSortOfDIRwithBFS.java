package beingzero.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import common.Graph;

public class TopologicalSortOfDIRwithBFS {

	public static void main(String[] args) {
		Graph<Integer> g = new Graph<Integer>(5);
		g.setDirected(true);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		List<Integer> topSort = topologicalSort(g);
		System.out.println();
		System.out.print("Topologic sort with BFS ");
		for(int i: topSort) {
			System.out.print("-"+i);
		}
		System.out.println();
		System.out.println("=====================");
		g = new Graph<Integer>(6);
		g.setDirected(true);
		g.addEdge(1, 3);
		g.addEdge(1, 2);
		g.addEdge(3, 2);
		g.addEdge(3, 5);
		//g.addEdge(4, 3); removed cycle
		g.addEdge(4, 2);
		g.addEdge(5, 4);
		 topSort = topologicalSort(g);
		System.out.println();
		System.out.print("Topologic sort with BFS ");
		for(int i: topSort) {
			System.out.print("-"+i);
		}
	}

	private static List<Integer> topologicalSort(Graph<Integer> g) {
		List<Integer> topSortList = new ArrayList<Integer>();
		int[] indegree = calculateIndegree(g);
		Queue<Integer> Q = new LinkedList<Integer>();
		for(int i=1; i<indegree.length;i++) {
			System.out.println("Indegree of Node::"+i+" -is :"+indegree[i]);
			if(indegree[i]==0) {
				Q.offer(i);
			}
		}
		
		while(!Q.isEmpty()) {
			int node = Q.poll();
			topSortList.add(node);
			for(int newNode : g.getAdjList().get(node)) {
				indegree[newNode]--;
				if(0==indegree[newNode]) {
					Q.offer(newNode);
				}
			}
			}
		return topSortList;
		
	}

	private static int[] calculateIndegree(Graph<Integer> g) {
		int[] indegree = new int[g.N];
		Arrays.fill(indegree,0);
		for(Map.Entry<Integer, List<Integer>> entry : g.getAdjList().entrySet()) {
			for(int node : entry.getValue()) {
				indegree[node]=indegree[node]+1;
			}
		}
		return indegree;
	}

}
/*
Topological sort can happen only on the directed and acyclic graph
Each Edge represents a  dependency
An order which lists the tasks in which they should be carried out is call topological sort

*/