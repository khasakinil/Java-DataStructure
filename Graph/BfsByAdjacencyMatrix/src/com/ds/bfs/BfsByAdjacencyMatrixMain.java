package com.ds.bfs;

import java.util.ArrayList;

import com.ds.bfs.node.GraphNode;

public class BfsByAdjacencyMatrixMain {
	public static void main(String[] args) {
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

		for (int i = 1; i <= 10; i++) {
			nodeList.add(new GraphNode("V" + i, i - 1));
		}

		BfsByAdjacencyMatrix graphByAdjacencyMatrix = new BfsByAdjacencyMatrix(nodeList);
		graphByAdjacencyMatrix.addUndirectedEdge(1, 2);
		graphByAdjacencyMatrix.addUndirectedEdge(1, 4);
		graphByAdjacencyMatrix.addUndirectedEdge(2, 3);
		graphByAdjacencyMatrix.addUndirectedEdge(2, 5);
		graphByAdjacencyMatrix.addUndirectedEdge(3, 6);
		graphByAdjacencyMatrix.addUndirectedEdge(3, 10);
		graphByAdjacencyMatrix.addUndirectedEdge(4, 7);
		graphByAdjacencyMatrix.addUndirectedEdge(5, 8);
		graphByAdjacencyMatrix.addUndirectedEdge(6, 9);
		graphByAdjacencyMatrix.addUndirectedEdge(7, 8);
		graphByAdjacencyMatrix.addUndirectedEdge(8, 9);
		graphByAdjacencyMatrix.addUndirectedEdge(9, 10);

		System.out.println("Printing BFS from Source Node V1");
		graphByAdjacencyMatrix.bfs();

	}
}
