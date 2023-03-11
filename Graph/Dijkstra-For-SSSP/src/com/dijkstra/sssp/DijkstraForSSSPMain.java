package com.dijkstra.sssp;

import java.util.ArrayList;

import com.dijkstra.sssp.node.WeightedNode;

public class DijkstraForSSSPMain {
	public static void main(String args[]) {
		ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();
		for (int i = 0; i < 5; i++) {
			nodeList.add(new WeightedNode("" + (char) (65 + i)));
		}

		DijkstraForSSSP graphDijkstra = new DijkstraForSSSP(nodeList);

		graphDijkstra.addWeightedEdge(1, 3, 6); // Add A-> C , weight 6
		graphDijkstra.addWeightedEdge(1, 4, 3); // Add A-> D , weight 3
		graphDijkstra.addWeightedEdge(2, 1, 3); // Add B-> A , weight 3
		graphDijkstra.addWeightedEdge(3, 4, 2); // Add C-> D , weight 2
		graphDijkstra.addWeightedEdge(4, 3, 1); // Add D-> C , weight 1
		graphDijkstra.addWeightedEdge(4, 2, 1); // Add D-> B , weight 1
		graphDijkstra.addWeightedEdge(5, 2, 4); // Add E-> B , weight 4
		graphDijkstra.addWeightedEdge(5, 4, 2); // Add E-> D , weight 2

		System.out.println("Printing Dijkstra SSSP from source E : ");
		graphDijkstra.dijkstraSssp(nodeList.get(4));

	}
}
