package com.ds.bfs;

import java.util.ArrayList;
import java.util.LinkedList;

import com.ds.bfs.node.GraphNode;

public class BfsByAdjacencyMatrix {

	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	int adjacencyMatrix[][];

	public BfsByAdjacencyMatrix(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
		adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
	}

	public void addUndirectedEdge(int i, int j) {
		i--;
		j--;
		adjacencyMatrix[i][j] = 1;
		adjacencyMatrix[j][i] = 1;
	}

	public void bfs() {
		for (GraphNode currentNode : nodeList) {
			if (!currentNode.isVisited()) {
				bfsVisit(currentNode);
			}
		}
	}

	private void bfsVisit(GraphNode currentNode) {
		LinkedList<GraphNode> queue = new LinkedList<>();
		queue.add(currentNode);
		while (!queue.isEmpty()) {
			GraphNode presentNode = queue.remove(0);
			if (!presentNode.isVisited()) {
				System.out.print(presentNode.getName() + " ");
				presentNode.setVisited(true);
				ArrayList<GraphNode> neighborList = getNeighbors(presentNode);

				for (GraphNode neighbor : neighborList) {
					if (!neighbor.isVisited()) {
						queue.add(neighbor);
					}

				}
			}
		}

	}

	private ArrayList<GraphNode> getNeighbors(GraphNode presentNode) {
		ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();

		int nodeIndex = presentNode.getIndex();

		for (int i = 0; i < adjacencyMatrix.length; i++) {
			if (adjacencyMatrix[i][nodeIndex] == 1) {
				neighbors.add(nodeList.get(i));
			}
		}
		return neighbors;
	}

}
