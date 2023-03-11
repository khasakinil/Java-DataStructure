package com.bfs.sssp;

import java.util.ArrayList;
import java.util.LinkedList;

import com.bfs.sssp.node.GraphNode;

public class BfsForSSSP {

	ArrayList<GraphNode> nodeList = new ArrayList<>();

	public BfsForSSSP(ArrayList<GraphNode> nodeList) {
		super();
		this.nodeList = nodeList;
	}

	public void addUndirectedEdge(int i, int j) {

		GraphNode firstNode = nodeList.get(i);
		GraphNode secondNode = nodeList.get(j);
		firstNode.getNeighbours().add(secondNode);
		secondNode.getNeighbours().add(firstNode);
	}

	public void bfsForSssp(GraphNode node) {
		LinkedList<GraphNode> queue = new LinkedList<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			GraphNode currentNode = queue.remove(0);
			currentNode.setVisited(true);
			System.out.println("Printing path from node- " + node.getName() + " to node- " + currentNode.getName());
			pathTraverse(currentNode);
			System.out.println();
			for (GraphNode neighbourNode : currentNode.getNeighbours()) {
				if (!neighbourNode.isVisited()) {
					queue.add(neighbourNode);
					neighbourNode.setVisited(true);
					neighbourNode.setParent(currentNode);
				}
			}
		}

	}

	private void pathTraverse(GraphNode currentNode) {
		if (currentNode.getParent() != null) {
			pathTraverse(currentNode.getParent());
		}

		if (currentNode.getParent() != null) {
			System.out.print(" ->  ");
		}

		System.out.print(currentNode + " ");

	}

}
