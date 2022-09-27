package top10.interview.questions.graph;

import java.util.*;

class BFS {
	private int vertex;
	private LinkedList<Integer> adj[];

	BFS(int size) {
	  	vertex = size;
		adj = new LinkedList[size];
		for(int i=0; i<size; ++i)
		  adj[i] = new LinkedList<Integer>();
	}

	//Function to add edge into the graph
	void addEdge(int vertex, int weight) {
		adj[vertex].add(weight);
	}

	//Print BFS traversal from given source s
	void breadthFirstSearch(int s) {
		boolean visited[] = new boolean[vertex];
	
		//Create queue for BFS 
		LinkedList<Integer> queue = new LinkedList<>();
		
		//Mark the current node as visited and enqueue it
		visited[s] = true;
		queue.add(s);
		
		while(queue.size() != 0) {
		
			//Dequeue a vertex
			s = queue.poll();
			System.out.println(s +"");
			
			//Get all adjacent vertices 
			//if not visited mark as visited
			Iterator<Integer> i = adj[s].listIterator();
				while(i.hasNext()) {
					int n = (int) i.next();
					if(!visited[n]) {
						visited[n] = true;
						queue.add(n);
					
				}
			}
		}
	}


	public static void main(String args[]) {
	
		BFS g = new BFS(4);
		g.addEdge(0,1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2,3);
		g.addEdge(3,3);
		g.breadthFirstSearch(2);
	
	}

}
