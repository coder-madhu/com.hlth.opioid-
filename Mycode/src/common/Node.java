package common;

import java.util.LinkedList;
import java.util.List;

public class Node {
	
	private String name;
	private int id;
	private int weight;
	private List<Node> neighbours= new LinkedList<>();
	private boolean visited;
	private Node parent;
	
	
	
	public Node(int id) {
		super();
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public List<Node> getNeighbours() {
		return neighbours;
	}
	public void setNeighbours(List<Node> neighbours) {
		this.neighbours = neighbours;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	

}
