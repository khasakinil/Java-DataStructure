package com.dfs.adjacencyMatrix;

import java.util.ArrayList;
import java.util.Stack;

import com.dfs.adjacencyMatrix.node.GraphNode;

public class DfsByAdjacencyMatrix {
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	int[][] adjacencyMatrix;

	public DfsByAdjacencyMatrix(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
		adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
	}

	public void addUndirectedGraph(int i, int j) {
		i--;
		j--;
		adjacencyMatrix[i][j] = 1;
		adjacencyMatrix[j][i] = 1;
	}

	public void bfsByAdjacencyMatrix() {
		for (GraphNode node : nodeList) {
			if (!node.isVisited()) {
				bfsVisit(node);
			}
		}
	}

	private void bfsVisit(GraphNode node) {

		Stack<GraphNode> stack = new Stack<GraphNode>();
		stack.add(node);

		while (!stack.isEmpty()) {
			GraphNode currentNode = stack.pop();
			currentNode.setVisited(true);
			System.out.print(currentNode.getName() + " ");

			ArrayList<GraphNode> neighborNodes = getNeighborNodes(currentNode);

			for (GraphNode neighborNode : neighborNodes) {
				if (!neighborNode.isVisited()) {
					stack.add(neighborNode);
				}
			}

		}

	}

	private ArrayList<GraphNode> getNeighborNodes(GraphNode currentNode) {

		ArrayList<GraphNode> neighborNodeList = new ArrayList<GraphNode>();

		int nodeIndex = currentNode.getIndex();

		for (int i = 0; i < adjacencyMatrix.length; i++) {
			if (adjacencyMatrix[nodeIndex][i] == 1) {
				neighborNodeList.add(nodeList.get(i));
			}
		}

		return neighborNodeList;
	}

}
