package com.dijkstra.sssp;

import java.util.ArrayList;
import java.util.PriorityQueue;

import com.dijkstra.sssp.node.WeightedNode;

public class DijkstraForSSSP {

	ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();

	public DijkstraForSSSP(ArrayList<WeightedNode> nodeList) {
		this.nodeList = nodeList;
	}

	public void addWeightedEdge(int i, int j, int d) {
		WeightedNode firstNode = nodeList.get(i - 1);
		WeightedNode secondNode = nodeList.get(j - 1);

		firstNode.getNeighbours().add(secondNode);
		firstNode.getWeightMap().put(secondNode, d);
	}

	public void dijkstraSssp(WeightedNode weightedNode) {
		PriorityQueue<WeightedNode> priorityQueue = new PriorityQueue<>();
		weightedNode.setDistance(0);
		priorityQueue.addAll(nodeList);

		while (!priorityQueue.isEmpty()) {
			WeightedNode currentNode = priorityQueue.remove();
			for (WeightedNode neighbourNode : currentNode.getNeighbours()) {
				if (priorityQueue.contains(neighbourNode)) {
					if (neighbourNode.getDistance() > (currentNode.getDistance()
							+ currentNode.getWeightMap().get(neighbourNode))) {
						neighbourNode
								.setDistance(currentNode.getDistance() + currentNode.getWeightMap().get(neighbourNode));
						neighbourNode.setParent(currentNode);
						priorityQueue.remove(neighbourNode);
						priorityQueue.add(neighbourNode);
					}
				}
			}
		}

		for (WeightedNode node : nodeList) {
			System.out.println("Node : " + node + ", Distance : " + node.getDistance() + ", Path : ");
			graphTraversal(node);
			System.out.println();
		}

	}

	private void graphTraversal(WeightedNode node) {
		if (node.getParent() != null) {
			graphTraversal(node.getParent());
			System.out.print("->" + node);
		} else {
			System.out.print(node);
		}
	}

}
