package com.dfs.linkedList;

import java.util.*;

import com.dfs.linkedList.node.GraphNode;

public class DfsByLinkedListIterative {
	ArrayList<GraphNode> nodeList = new ArrayList<>();

	public DfsByLinkedListIterative(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}

	public void addUndirectedEdge(int i, int j) {
		GraphNode firstNode = nodeList.get(i - 1);
		GraphNode secondNode = nodeList.get(j - 1);

		firstNode.getNeighbors().add(secondNode);
		secondNode.getNeighbors().add(firstNode);
	}

	public void dfsTraversal() {
		for (GraphNode node : nodeList) {
			if (!node.isVisted()) {
				dfsTraversalLinkedList(node);
			}
		}
	}

	private void dfsTraversalLinkedList(GraphNode node) {
		Stack<GraphNode> stack = new Stack<>();
		stack.push(node);

		while (!stack.isEmpty()) {
			GraphNode currentNode = stack.pop();
			currentNode.setVisted(true);

			System.out.print(currentNode.getName() + " ");

			for (GraphNode neighborNode : currentNode.getNeighbors()) {
				if (!neighborNode.isVisted()) {
					stack.push(neighborNode);
					neighborNode.setVisted(true);
				}
			}
		}

	}

}
