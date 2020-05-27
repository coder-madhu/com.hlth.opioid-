package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {
	
	Map<T,List<T>> adjList ;
	boolean directed;
	List<Edge<T>> allEdges ;
	public int N;
	
	
	public Map<T, List<T>> getAdjList() {
		return adjList;
	}
	public Graph(int N) {
		this.N = N;
		this.adjList = new HashMap<T, List<T>>();
		this.allEdges = new ArrayList<>();
	}
	
	public Graph(){
		this.adjList = new HashMap<T, List<T>>();
		this.allEdges = new ArrayList<>();
	}
	
	public void setDirected(boolean isDirected) {
		this.directed = isDirected;
	}
	public boolean isDirected() {
		return this.directed;
	}
	
	public void addEdge(T v1, T v2) {
		if(!adjList.containsKey(v1)) {
			adjList.put(v1, new ArrayList<>());
		}
		if(!adjList.containsKey(v2)) {
			adjList.put(v2, new ArrayList<>());
		}
			adjList.get(v1).add(v2);
			if(!isDirected()) {
			adjList.get(v2).add(v1);
			}
			Edge<T> edge = new Edge<T>(v1, v2);
			edge.setDirected(isDirected());
			allEdges.add(edge);
	}
	
	
	
	public List<T> getAdjNodes(T v){
		if(adjList.containsKey(v)) {
			return adjList.get(v);
		}else {
			return new ArrayList<>();
		}
	}

	public List<Edge<T>> getAllEdges() {
		return allEdges;
	}

}

class Edge<T>{
	T v1;
	T v2;
	int weight;
	T parent;
	boolean isDirected;
	
	public Edge(T v1, T v2) {
		super();
		this.v1 = v1;
		this.v2 = v2;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public T getParent() {
		return parent;
	}

	public void setParent(T parent) {
		this.parent = parent;
	}

	public boolean isDirected() {
		return isDirected;
	}

	public void setDirected(boolean isDirected) {
		this.isDirected = isDirected;
	}
	
	
}
