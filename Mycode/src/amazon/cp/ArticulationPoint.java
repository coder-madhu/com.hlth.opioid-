package amazon.cp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import common.Graph;

public class ArticulationPoint {

    private int time;

    public Set<Integer> findarticulationPoints(G graph, int startNode) {
        time = 0;
        Set<Integer> visited = new HashSet<>();
        Set<Integer> articulationPoints = new HashSet<>();
       // Integer startNode = graph.getAllVertex().iterator().next();

        Map<Integer, Integer> visitedTime = new HashMap<>();
        Map<Integer, Integer> lowTime = new HashMap<>();
        Map<Integer, Integer> parent = new HashMap<>();

        DFS(visited,articulationPoints,startNode, visitedTime, lowTime, parent,graph);
        return articulationPoints;
    }

    private void DFS(Set<Integer> visited,
            Set<Integer> articulationPoints, Integer vertex,
            Map<Integer, Integer> visitedTime,
            Map<Integer, Integer> lowTime, Map<Integer, Integer> parent,G graph) {
        visited.add(vertex);
        visitedTime.put(vertex, time);
        lowTime.put(vertex, time);
        time++;
        int childCount =0;
        boolean isArticulationPoint = false;
       
        for(Integer adj : graph.adjList.get(vertex)){
            //if adj is same as parent then just ignore this vertex.
            if(adj.equals(parent.get(vertex))) {
                continue;
            }
            //if adj has not been visited then visit it.
            if(!visited.contains(adj)) {
                parent.put(adj, vertex);
                childCount++;
                DFS(visited, articulationPoints, adj, visitedTime, lowTime, parent,graph);

                if(visitedTime.get(vertex) <= lowTime.get(adj)) {
                    isArticulationPoint = true;
                } else {
                    //below operation basically does lowTime[vertex] = min(lowTime[vertex], lowTime[adj]);
                    lowTime.compute(vertex, (currentVertex, time) ->
                        Math.min(time, lowTime.get(adj))
                    );
                }

            } else { //if adj is already visited see if you can get better low time.
                //below operation basically does lowTime[vertex] = min(lowTime[vertex], visitedTime[adj]);
                lowTime.compute(vertex, (currentVertex, time) ->
                                Math.min(time, visitedTime.get(adj))
                );
            }
        }

        //checks if either condition 1 or condition 2 meets). If yes then it is articulation point.
        if((parent.get(vertex) == null && childCount >= 2) || parent.get(vertex) != null && isArticulationPoint ) {
            articulationPoints.add(vertex);
        }
    }

    
    
    public static void main(String args[]){
        G graph = new G(9);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 7);
        graph.addEdge(7, 5);
        graph.addEdge(6, 8);

        //bigger example
        /*
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(4, 2);
        graph.addEdge(3, 5);
        graph.addEdge(4, 6);
        graph.addEdge(6, 3);
        graph.addEdge(6, 7);
        graph.addEdge(6, 8);
        graph.addEdge(7, 9);
        graph.addEdge(9, 10);
        graph.addEdge(8, 10);*/

        ArticulationPoint ap = new ArticulationPoint();
        Set<Integer> aPoints = ap.findarticulationPoints(graph,1);
        aPoints.forEach(point -> System.out.println(point));
    }
    
}

class G{
	Map<Integer,List<Integer>> adjList;
	int N;
	
	public G(int N) {
		this.N= N;
		adjList= new HashMap<>();
		for(int i=0; i<N;i++) {
			adjList.put(i, new ArrayList<>());
		}
		
	}
	
	public void addEdge(int N1,int N2) {
			adjList.get(N1).add(N2);
	}
	
}