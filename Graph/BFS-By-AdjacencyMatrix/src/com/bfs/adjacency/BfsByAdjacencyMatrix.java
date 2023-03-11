package com.bfs.adjacency;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.bfs.GraphNode;

public class BfsByAdjacencyMatrix {

	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	int[][] adjacencyMatrix;

	public BfsByAdjacencyMatrix(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
		adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
	}

	public void addUndirectedGraph(int i, int j) {
		i--;
		j--;

		adjacencyMatrix[i][j] = 1;
		adjacencyMatrix[j][i] = 1;
	}

	public void bfs() {
		for (GraphNode node : nodeList) {
			if (!node.isVisited()) {
				bfsVisit(node);
			}
		}
	}

	private void bfsVisit(GraphNode node) {
		Queue<GraphNode> queue = new LinkedList<>();
		queue.add(node);

		while (!queue.isEmpty()) {
			GraphNode currentNode = queue.remove();
			if (currentNode.isVisited() == false) {
				currentNode.setVisited(true);
				System.out.print(currentNode.getName() + " ");
				ArrayList<GraphNode> neighbors = getNeighborList(currentNode);

				for (GraphNode neighborNode : neighbors) {
					if (!neighborNode.isVisited()) {
						queue.add(neighborNode);
					}
				}
			}
		}
	}

	private ArrayList<GraphNode> getNeighborList(GraphNode currentNode) {
		ArrayList<GraphNode> neighborList = new ArrayList<GraphNode>();

		int nodeIndex = currentNode.getIndex();

		for (int i = 0; i < adjacencyMatrix.length; i++) {
			if (adjacencyMatrix[nodeIndex][i] == 1) {
				neighborList.add(nodeList.get(i));
			}
		}

		return neighborList;
	}

}
