package graphsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSForSSP {
	
	BFSForSSP(GraphNode node){
		
		Queue<GraphNode> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			GraphNode n  = queue.poll();
			n.visited=true;
			System.out.println("printing path for node"+n.getName());
			printPath(n);
			for(GraphNode d : n.neighbours) {
				if(!d.isVisited()) {
					queue.add(d);
					d.setVisited(true);
					d.setParent(n);
				}
				queue.add(d);
			}
			
		}
		
	}

	private void printPath(GraphNode n) {
		if(n.getParent()!=null) {
			printPath(n.getParent());
			System.out.print(n+" ");
		}
		
	}
	

}
class GraphNode{
	boolean visited;
	GraphNode parent;
	List<GraphNode> neighbours = new ArrayList<>();
	String name;
	int index;
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public GraphNode getParent() {
		return parent;
	}
	public void setParent(GraphNode parent) {
		this.parent = parent;
	}
	public List<GraphNode> getNeighbours() {
		return neighbours;
	}
	public void setNeighbours(List<GraphNode> neighbours) {
		this.neighbours = neighbours;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
}
