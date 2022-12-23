package top10.interview.questions.graph;

public class ShortestPath {

	static final int VERTEX = 9;
	
	int minDistance(int distance[], Boolean sptSet[]) {
		
		//Initialize minimum value
		int min = Integer.MAX_VALUE, minIndex=-1;
		
		for(int v=0; v <VERTEX; v++) 
			if(sptSet[v] ==false && distance[v]<=min) {
				min = distance[v];
				minIndex =v;
			}
			return minIndex;	
		}
	
	//Utility function to print the constructed distance
	void printSolution(int distance[]) {
		System.out.println("Vertex \t\t Dsitance from source");
		for(int index=0; index<VERTEX; index++)
			System.out.println(index+ " \t\t " + distance[index]);
	}
	
	
	void dijkstra(int graph[][], int source) {
		
		//output array hold the shortest distance from 
		//source to i
		int distance[] = new int[VERTEX];
		
		//sptSet[i] will true if vertex i is included in
		//shortest path tree or shortest distance from source
		//to i is finalized
		
		Boolean sptSet[] = new Boolean[VERTEX]; 
		
		//Initialized all distance as INFINITE and 
		//stpSet[] as false
		
		for(int i=0; i <VERTEX; i++) {
			distance[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}
		
		//Distance of path for all vertices
		distance[source] = 0;
		
		//find the shortest path for all vertices
		for(int count =0; count < VERTEX-1; count++) {
			
			//pick the minimum distance vertex from the set
			//of vertices not yet processed, u is always
			//equal to source in first iteration
			int u = minDistance(distance, sptSet);
			
			//Update distance value of the adjacent
			//vertices of the picked vertex
			sptSet[u] = true;
			
			//update the distance value of the adjacent vertices of the 
			//picked vertices
			
			for(int v = 0; v <VERTEX ; v++)
				//Update distance[v] only if is not in sptSet,
				//there is an edge from u to v, and total
				//weight of path from source to v through u is
				//smaller than current value of distance[v]
				if(!sptSet[v] && graph[u][v]!=0 &&
					distance[u] != Integer.MAX_VALUE &&
					distance[u]+graph[u][v] < distance[v])
					distance[v] = distance[u] + graph[u][v];
			
		}
		
		
		printSolution(distance);
		
	}
	
	
	
	// Driver's code
    public static void main(String[] args) {
    //Let us create the example graph discussed above
        int graph[][] = new int[][] 
        		{ 
        		{ 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } 
                };
        ShortestPath t = new ShortestPath();
 
        // Function call
    t.dijkstra(graph, 0);
    }
}
