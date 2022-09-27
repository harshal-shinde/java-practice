package top10.interview.questions.graph;

import java.io.*;
import java.util.*;

class DepthFirstSearch {
private static int numberOfVertices;
private static LinkedList<Integer> adjanceyList[];

DepthFirstSearch(int noOfVertices) {
	numberOfVertices = noOfVertices;
	adjanceyList = new LinkedList[noOfVertices];

for(int index=0;index < noOfVertices; ++index) {
	adjanceyList[index] = new LinkedList();
}

}

//function to add edge into the graph
void addEdge(int vertex, int adjancentVertex) {
adjanceyList[vertex].add(adjancentVertex);
}

//A function used by dfs
static void DFSUtil(int vertex, boolean visited[]) {

	//Mark visited node to true and print
	visited[vertex] = true;
	System.out.print(vertex + " ");

	//recur for all the vertices
	Iterator i = adjanceyList[vertex].listIterator();
	while(i.hasNext()) {
		int n = (int) i.next();
		if(!visited[n]) {
			DFSUtil(n, visited);	
	}
} 

}

static void DFS(int vertex) {

	boolean visited[] = new boolean[numberOfVertices];
	DFSUtil(vertex, visited);
}

public static void main (String args[]) {

DepthFirstSearch depthFirstSearch = new DepthFirstSearch(4);
depthFirstSearch.addEdge(0, 1);
depthFirstSearch.addEdge(0, 2);
depthFirstSearch.addEdge(1, 2);
depthFirstSearch.addEdge(2, 0);
depthFirstSearch.addEdge(2, 3);
depthFirstSearch.addEdge(3, 3);

DepthFirstSearch.DFS(2);
}

}

