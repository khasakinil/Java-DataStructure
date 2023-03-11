package com.bfs.adjacency;

import java.util.ArrayList;

import com.bfs.GraphNode;

public class BfsByAdjacencyMatrixMain {
	public static void main(String args[]) {
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

		for (int i = 1; i < 11; i++) {
			nodeList.add(new GraphNode("V" + i, i - 1));
		}

		BfsByAdjacencyMatrix graph = new BfsByAdjacencyMatrix(nodeList);

		graph.addUndirectedGraph(1, 2);
		graph.addUndirectedGraph(1, 4);
		graph.addUndirectedGraph(2, 3);
		graph.addUndirectedGraph(2, 5);
		graph.addUndirectedGraph(3, 6);
		graph.addUndirectedGraph(3, 10);
		graph.addUndirectedGraph(4, 7);
		graph.addUndirectedGraph(5, 8);
		graph.addUndirectedGraph(6, 9);
		graph.addUndirectedGraph(7, 8);
		graph.addUndirectedGraph(8, 9);
		graph.addUndirectedGraph(9, 10);

		System.out.println("BFS from the source Vertex V1");

		graph.bfs();

	}
}
