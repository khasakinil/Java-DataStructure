package com.sssp.bellmaFord;

import java.util.ArrayList;

import com.sssp.bellmaFord.node.WeightedNode;

public class BellmanFordForSSSP {

	ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();

	public BellmanFordForSSSP(ArrayList<WeightedNode> nodeList) {
		this.nodeList = nodeList;
	}

	public void addWeightedEdge(int i, int j, int d) {
		WeightedNode firstNode = nodeList.get(i - 1);
		WeightedNode secondNode = nodeList.get(j - 1);
		firstNode.getNeighbours().add(secondNode);
		firstNode.getWeightMap().put(secondNode, d);
	}

	public void bellmanFord(WeightedNode sourceNode) {
		sourceNode.setDistance(0);

		for (int i = 1; i < nodeList.size(); i++) {
			for (WeightedNode currentNode : nodeList) {
				for (WeightedNode neighbour : currentNode.getNeighbours()) {
					if (neighbour
							.getDistance() > (currentNode.getDistance() + currentNode.getWeightMap().get(neighbour))) {
						neighbour.setDistance(currentNode.getDistance() + currentNode.getWeightMap().get(neighbour));
						neighbour.setParent(currentNode);
					}
				}
			}
		}

		System.out.println("Checking for the negative cycle");

		for (WeightedNode currentNode : nodeList) {
			for (WeightedNode neighbour : currentNode.getNeighbours()) {
				if (neighbour.getDistance() > (currentNode.getDistance() + currentNode.getWeightMap().get(neighbour))) {
					System.out.println("Negative Cycle found");
					System.out.println("Vertex : " + neighbour.getName());
					System.out.println("Current Distance : " + neighbour.getDistance());
					int newDistance = currentNode.getDistance() + currentNode.getWeightMap().get(neighbour);
					System.out.println("New Distance : " + newDistance);
					return;
				}
			}
		}

		System.out.println("Negative Cycle not found..!");

		System.out.println("Traversing Graph :");
		for (WeightedNode node : nodeList) {
			if (node.getDistance() != Integer.MAX_VALUE / 10) {
				System.out.print("Node : " + node + ", Distance : " + node.getDistance() + ", Path : ");
				graphTraversal(node);
				System.out.println();
			} else {
				System.out.println("No path for node : " + node.getName());
			}
		}
	}

	private void graphTraversal(WeightedNode node) {

		if (node.getParent() != null) {
			graphTraversal(node.getParent());
			System.out.print("-> " + node);
		} else {
			System.out.print(node);
		}
	}

}
