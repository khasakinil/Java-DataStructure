package com.dfs.linkedList;

import java.util.ArrayList;
import java.util.Stack;

import com.dfs.linkedList.node.GraphNode;

public class DfsRecursiveByLinkedList {

	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

	public DfsRecursiveByLinkedList(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}

	public void addUndirectedEdge(int i, int j) {
		GraphNode firstNode = nodeList.get(i - 1);
		GraphNode secondNode = nodeList.get(j - 1);
		firstNode.getNeighbors().add(secondNode);
		secondNode.getNeighbors().add(firstNode);
	}

	public void dfsRecursion() {
		for (GraphNode node : nodeList) {
			if (!node.isVisited()) {
				dfsVisit(node);
			}
		}
	}

	private void dfsVisit(GraphNode node) {
		node.setVisited(true);
		System.out.print(node.getName() + " ");
		for (GraphNode neighborNode : node.getNeighbors()) {
			if (!neighborNode.isVisited()) {
				dfsVisit(neighborNode);
			}
		}
	}

}
