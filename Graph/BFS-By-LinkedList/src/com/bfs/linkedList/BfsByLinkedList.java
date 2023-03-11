package com.bfs.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

import com.bfs.GraphNode;

public class BfsByLinkedList {

	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

	public BfsByLinkedList(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}

	public void addUndirectedEdge(int i, int j) {
		GraphNode firstNode = nodeList.get(i - 1);
		GraphNode secondNode = nodeList.get(j - 1);
		firstNode.getNeighborNodes().add(secondNode);
		secondNode.getNeighborNodes().add(firstNode);
	}

	public void bfs() {
		for (GraphNode node : nodeList) {
			if (!node.isVisited()) {
				bfsVisit(node);
			}
		}
	}

	private void bfsVisit(GraphNode node) {

		LinkedList<GraphNode> queue = new LinkedList<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			GraphNode currentNode = queue.remove(0);
			currentNode.setVisited(true);
			System.out.print(currentNode.getName() + " ");

			for (GraphNode neighborNode : currentNode.getNeighborNodes()) {
				if (!neighborNode.isVisited()) {
					queue.add(neighborNode);
					neighborNode.setVisited(true);
				}
			}
		}
	}

}
