package com.dfs.adjacencyMatrix;

import java.util.ArrayList;

import com.dfs.adjacencyMatrix.node.GraphNode;

public class DfsByAdjacencyMatrixMain {

	public static void main(String[] args) {
		ArrayList<GraphNode> nodeList = new ArrayList<>();

		for (int i = 1; i < 11; i++) {
			nodeList.add(new GraphNode("V" + i, i - 1));
		}

		DfsByAdjacencyMatrix graphAdjacencyMatrix = new DfsByAdjacencyMatrix(nodeList);

		graphAdjacencyMatrix.addUndirectedGraph(1, 2);
		graphAdjacencyMatrix.addUndirectedGraph(1, 4);
		graphAdjacencyMatrix.addUndirectedGraph(2, 3);
		graphAdjacencyMatrix.addUndirectedGraph(2, 5);
		graphAdjacencyMatrix.addUndirectedGraph(3, 6);
		graphAdjacencyMatrix.addUndirectedGraph(3, 10);
		graphAdjacencyMatrix.addUndirectedGraph(4, 7);
		graphAdjacencyMatrix.addUndirectedGraph(5, 8);
		graphAdjacencyMatrix.addUndirectedGraph(6, 9);
		graphAdjacencyMatrix.addUndirectedGraph(7, 8);
		graphAdjacencyMatrix.addUndirectedGraph(8, 9);
		graphAdjacencyMatrix.addUndirectedGraph(9, 10);

		System.out.println("DFS from the source Vertex V1");

		graphAdjacencyMatrix.bfsByAdjacencyMatrix();

	}

}
